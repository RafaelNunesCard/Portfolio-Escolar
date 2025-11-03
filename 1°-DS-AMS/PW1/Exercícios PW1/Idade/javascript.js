document.getElementById("btnCalcular").addEventListener("click", function() {
    const nascimentoInput = document.getElementById("nascimento").value;
    if (!nascimentoInput) {
        alert("Por favor, insira sua data de nascimento.");
        return;
    }

    const nascimento = new Date(nascimentoInput);
    const hoje = new Date();
    let idade = hoje.getFullYear() - nascimento.getFullYear();
    const diferencaMeses = hoje.getMonth() - nascimento.getMonth();

    // Verifica se o aniversário já ocorreu este ano
    if (diferencaMeses < 0 || (diferencaMeses === 0 && hoje.getDate() < nascimento.getDate())) {
        idade--;
    }

    // Exibe o resultado
    document.getElementById("resultado").textContent = `Você tem ${idade} anos.`;
});