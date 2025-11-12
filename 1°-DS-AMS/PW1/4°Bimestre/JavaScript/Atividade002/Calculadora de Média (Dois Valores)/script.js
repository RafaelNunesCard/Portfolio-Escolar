var res = document.getElementById('resultado')
var n = document.getElementById('n')
var soma = 0

function verificar(){ 
    var num = Number(n.value)

    if(n.value.length == 0){
        window.alert('Preencha os espaços')
        
    }else{
        res.innerText = ''

        soma += num

        res.innerHTML += `Número adicionado ${num}<br/>`

        res.innerText += `A média é ${soma/2}`
    }
}