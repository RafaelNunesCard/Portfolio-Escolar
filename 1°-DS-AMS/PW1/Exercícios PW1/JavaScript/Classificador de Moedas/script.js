var res = document.getElementById('resultado')
var n = document.getElementById('n')

function verificar(){  
    if(n.value.lenght == 0){
        window.alert('Preencha o espaço para verificar!')
    }else{
        var moeda = Number(n.value)

        if(moeda.toFixed(2) == 0.01){
            res.innerHTML = `Um Centavo`
        }else if(moeda.toFixed(2) == 0.05){
            res.innerHTML = `Cinco Centavos`
        }else if(moeda.toFixed(2) == 0.1){
            res.innerHTML = `Dez Centavos`
        }else if(moeda.toFixed(2) == 0.25){
            res.innerHTML = `Vinte e Cinco Centavos`
        }else if(moeda.toFixed(2) == 0.5){
            res.innerHTML = `Cinquenta Centavos`
        }else if(moeda == 1){
            res.innerHTML = `Um real`
        }else{
            window.alert('Não existe')
        }
    }
}