document.addEventListener('DOMContentLoaded', function () {
    var path = window.location.pathname;
    var links = document.querySelectorAll('.nav-tabs-custom .nav-link-tab');
    var matched = false;

    links.forEach(function (link) {
        link.classList.remove('active');
        var href = link.getAttribute('href');
        if (href && href !== '/Apartments' && path.startsWith(href)) {
            link.classList.add('active');
            matched = true;
        }
    });

    if (!matched) {
        links.forEach(function (link) {
            if (link.getAttribute('href') === '/Apartments') {
                link.classList.add('active');
            }
        });
    }
});
