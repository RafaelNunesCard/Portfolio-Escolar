var res = document.getElementById('resultado')
var n = document.getElementById('n')

let soma = 0
let qtd = 0

function verificar(){ 
    var num = Number(n.value)

    if(n.value.length == 0){
        window.alert('Preencha os espaços')
        return
    }

    // limpa o campo
    n.value = ''
    n.focus()

    // soma e quantidade
    soma += num
    qtd++

    let media = soma / qtd

    res.innerHTML = `
        Número adicionado: ${num}<br>
        Soma: ${soma}<br>
        Quantidade: ${qtd}<br>
        Média: ${media.toFixed(2)}<br>
    `

    if(media >= 7){
        res.innerHTML += `<strong>Aprovado</strong>`
    }else{
        res.innerHTML += `<strong>Reprovado</strong>`
    }
}