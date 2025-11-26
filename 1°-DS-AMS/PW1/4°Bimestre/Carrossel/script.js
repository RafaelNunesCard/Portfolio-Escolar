document.addEventListener("DOMContentLoaded", () => {
  const itens = document.querySelectorAll(".tema");
  const prev = document.querySelector(".arrow-left");
  const next = document.querySelector(".arrow-right");
  let current = 0;
  let intervalo;

  function showItem(index) {
    itens.forEach(item => item.classList.remove("ativo"));
    itens[index].classList.add("ativo");
  }

  function trocarAutomatico() {
    intervalo = setInterval(() => {
      current = (current + 1) % itens.length;
      showItem(current);
    }, 10000);
  }

  prev.addEventListener("click", () => {
    current = (current - 1 + itens.length) % itens.length;
    showItem(current);
    resetarTempo();
  });

  next.addEventListener("click", () => {
    current = (current + 1) % itens.length;
    showItem(current);
    resetarTempo();
  });

  function resetarTempo() {
    clearInterval(intervalo);
    trocarAutomatico();
  }

  showItem(current);
  trocarAutomatico();
});