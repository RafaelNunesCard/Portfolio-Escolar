var res = document.getElementById('resultado')
var nome = document.getElementById('nome')
var sobre = document.getElementById('sobre')

function verificar(){ 
    let n = nome.value
    let s = sobre.value

    res.textContent = `O seu nome completo é ${n} ${s}`
}