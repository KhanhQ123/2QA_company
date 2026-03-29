function toggleScheduleFields() {
    var loai = document.getElementById('loaiThongBao').value;
    var fields = document.getElementById('scheduleFields');
    if (!fields) return;
    if (loai === 'LICH_CAT_DIEN_NUOC' || loai === 'LICH_BAO_TRI') {
        fields.style.display = 'block';
    } else {
        fields.style.display = 'none';
    }
}

document.addEventListener('DOMContentLoaded', toggleScheduleFields);
