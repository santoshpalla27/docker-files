let nav = document.querySelector(".nav-links");
let btn = document.querySelector(".nav-title i");

let navtoggle = ()=>{
    nav.classList.toggle("open");
}

btn.addEventListener('click',navtoggle);

