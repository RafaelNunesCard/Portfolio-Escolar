function verificar() {

    const nascimentoInput = document.getElementById("nascimento").value

    if (!nascimentoInput) {
        window.alert("Por favor, insira sua data de nascimento.")
    }

    var res = document.getElementById("resultado")
    const nascimento = new Date(nascimentoInput)
    const hoje = new Date()
    let idade = hoje.getFullYear() - nascimento.getFullYear()
    const diferencaMeses = hoje.getMonth() - nascimento.getMonth()

    // Verifica se o aniversário já ocorreu este ano
    if (diferencaMeses < 0 || (diferencaMeses === 0 && hoje.getDate() < nascimento.getDate())) {
        idade--
    }

    if (idade < 18){
        res.textContent = `Você tem ${idade} anos, não pode dirigir`
    }else{
        res.textContent = `Você tem ${idade} anos, pode dirigir`
    }
}