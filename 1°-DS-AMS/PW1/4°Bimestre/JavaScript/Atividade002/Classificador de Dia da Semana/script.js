var res = document.getElementById('resultado')
var agora = new Date()
var diaSem = agora.getDay()

switch (diaSem){
    case 0:
        res.textContent = 'Hoje é Domingo! ^-^'
        break
    case 1:
        res.textContent = 'Hoje é Segunda! ;-;'
        break
    case 2:
        res.textContent = 'Hoje é Terça! ;-;'
        break
    case 3:
        res.textContent = 'Hoje é Quarta! -_-'
        break
    case 4:
        res.textContent = 'Hoje é Quinta! -_-'
        break
    case 5:
        res.textContent = 'Hoje é Sexta! ^-^'
        break
    case 6:
        res.textContent = 'Hoje é Sábado! ^-^'
        break
    default:
        res.textContent = '[ERRO] Dia Inválido!'
        break
}
