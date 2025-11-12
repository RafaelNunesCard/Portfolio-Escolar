var res = document.getElementById('resultado')
var nome = document.getElementById('nome')
var sobre = document.getElementById('sobre')

function verificar(){ 
    res.textContent = `O seu ${nome} ${sobre}`
}