const logo = document.querySelector(".block1");
const search = document.querySelector(".block2");
const nav = document.querySelector(".block3");

window.addEventListener("scroll", function(e) {
    console.log(window.scrollY);
    if (window.scrollY !== 0 ) {
        logo.style.opacity = 0;
        logo.style.height = "0";

        search.style.opacity = 0;
        search.style.height = "0";

        nav.style.opacity = 0;
        nav.style.height = "0";
    } else {
        logo.style.opacity = 1;
        logo.style.height = "150px";

        search.style.opacity = 1;
        search.style.height = "150px";

        nav.style.opacity = 1;
        nav.style.height = "150px";
    }
});
