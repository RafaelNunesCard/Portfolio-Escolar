var res = document.getElementById('resultado')
var temp = document.getElementById('temp')

function verificar(){  
    var c = Number(temp.value)

    if(c < 10){
        res.style.color = 'rgb(134, 204, 228)'
        res.textContent = `Alerta de frio ${c}°C`
    }else if(c < 25){
        res.style.color = 'black'
        res.textContent = `Temperatura ideal ${c}°C`
    }else{
        res.style.color = 'rgb(255, 101, 101)'
        res.textContent = `Alerta de calor ${c}°C`
    }
}