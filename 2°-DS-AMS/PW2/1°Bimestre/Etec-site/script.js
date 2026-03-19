// MENU
function toggleMenu() {
  document.getElementById("menu").classList.toggle("active");
}




// POPUP
function popup(e) {
  e.preventDefault();
  document.getElementById("pop").classList.add("active");
}

function closePop() {
  document.getElementById("pop").classList.remove("active");
}

// THEME
function toggleTheme() {
  document.body.classList.toggle("light-mode");
}

// SCROLL ANIMATION
window.addEventListener("scroll", () => {
  document.querySelectorAll(".reveal").forEach((el) => {
    let top = el.getBoundingClientRect().top;
    if (top < window.innerHeight - 100) {
      el.classList.add("active");
    }
  });
});
