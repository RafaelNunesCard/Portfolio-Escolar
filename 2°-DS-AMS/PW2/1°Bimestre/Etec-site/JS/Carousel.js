const track = document.querySelector('.carousel-track');
const slides = Array.from(track.children);
const nextButton = document.querySelector('.next');
const prevButton = document.querySelector('.prev');

let currentIndex = 0;

function updateCarousel() {
  const width = slides[0].getBoundingClientRect().width;
  track.style.transform = `translateX(-${width * currentIndex}px)`;

  // nunca some, só desativa visualmente
  nextButton.style.display = currentIndex === slides.length - 1 ? 'none' : 'flex';
  prevButton.style.display = currentIndex === 0 ? 'none' : 'flex';
  
}

nextButton.addEventListener('click', () => {
  if (currentIndex < slides.length - 1) {
    currentIndex++;
    updateCarousel();
  }
});

prevButton.addEventListener('click', () => {
  if (currentIndex > 0) {
    currentIndex--;
    updateCarousel();
  }
});

// inicializa
updateCarousel();