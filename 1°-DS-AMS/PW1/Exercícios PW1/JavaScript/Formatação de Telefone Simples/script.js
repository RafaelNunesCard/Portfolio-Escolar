var res = document.getElementById('resultado')
var tell = document.getElementById('tell')

function verificar(){
    if(!tell.value || tell.value.length < 8 || tell.value.length > 8 ){
        window.alert('Preencha com 8 números') 

    }else{
        var telefone = tell.value.replace(/\D/g, '')
        telefone = telefone.replace(/(\d{4})(\d)/, '$1-$2')

        res.textContent = `O seu telefone é ${telefone}`
    }
}