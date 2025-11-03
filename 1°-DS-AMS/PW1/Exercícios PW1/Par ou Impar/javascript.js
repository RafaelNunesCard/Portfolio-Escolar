document.getElementById("btnCalcular").addEventListener("click", function() {
    const numeroInput = document.getElementById("numero").value;
    const numero = parseInt(numeroInput, 10);

    if (isNaN(numero)) {
        alert("Por favor, insira um número válido.");
        return;
    }

    const resultado = (numero % 2 === 0) ? "O número é par." : "O número é ímpar.";
    document.getElementById("resultado").textContent = resultado;
});