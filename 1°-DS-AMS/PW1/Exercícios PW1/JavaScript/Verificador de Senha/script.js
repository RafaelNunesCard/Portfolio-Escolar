var res = document.getElementById('resultado')
var senha = document.getElementById('senha')
var data = new Date()
var ano = data.getFullYear()

function verificar(){  
    if(senha.value.length < 8){
        res.textContent = 'A senha tem que ter 8 caracteres'

    }else if(senha.value === '12345678'){
        res.textContent = `É sério 12345678 em ${ano}`

    }else{
        res.style.color = 'green'
        res.textContent = `Você foi cadastrado!`
    }
}