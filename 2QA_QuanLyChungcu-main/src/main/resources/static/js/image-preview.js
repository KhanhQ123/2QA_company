// Dùng cho product/add và product/edit (previewBox)
function previewImage(input) {
    var box = document.getElementById('previewBox');
    if (box && input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            box.innerHTML = '<img src="' + e.target.result + '">';
        };
        reader.readAsDataURL(input.files[0]);
    }
}

// Dùng cho quan-ly-dich-vu/add và edit (previewImg + imagePreview)
function previewServiceImage(event) {
    if (!event.target.files[0]) return;
    var reader = new FileReader();
    reader.onload = function () {
        var preview = document.getElementById('previewImg');
        if (preview) {
            preview.src = reader.result;
            document.getElementById('imagePreview').style.display = 'block';
        }
    };
    reader.readAsDataURL(event.target.files[0]);
}
