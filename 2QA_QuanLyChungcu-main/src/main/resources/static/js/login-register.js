function toggleChungCuId() {
    var role = document.getElementById('register-role').value;
    var group = document.getElementById('chungCuId-group');
    var roomGroup = document.getElementById('room-group');
    if (role === 'ROLE_USER') {
        group.style.display = 'block';
        roomGroup.style.display = 'block';
    } else {
        group.style.display = 'none';
        roomGroup.style.display = 'none';
        var chungCuInput = document.getElementById('register-chungcuid');
        var roomInput = document.getElementById('register-room');
        if (chungCuInput) chungCuInput.value = '';
        if (roomInput) roomInput.value = '';
    }
}

document.addEventListener('DOMContentLoaded', function () {
    toggleChungCuId();
    if (window.__openRegister) {
        var registerTab = document.querySelector('[data-target="#register-form"]');
        if (registerTab) registerTab.click();
        toggleChungCuId();
    }
});
