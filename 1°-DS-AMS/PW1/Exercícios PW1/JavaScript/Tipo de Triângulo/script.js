var res = document.getElementById('resultado')
var l1 = document.getElementById('l1')
var l2 = document.getElementById('l2')
var l3 = document.getElementById('l3')

function verificar(){ 
    var L1 = Number(l1.value)
    var L2 = Number(l2.value)
    var L3 = Number(l3.value)

    if(L1 == L2 && L2 == L3){
        res.textContent = 'Esse triãngulo e um Equilátero'
    }else if(L1 == L2 || L1 == L3 || L2 == L3){
        res.textContent = 'Esse triãngulo e um Isóceles'
    }else{
        res.textContent = 'Esse triãngulo e um Escaleno'
    }
}