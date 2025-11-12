var res = document.getElementById('resultado')
var n = document.getElementById('n')
let number = []

function verificar(){  
    if(n.value.length == 0){
        window.alert('Preencha o conteudo')

    }else{
        number.push(Number(n.value))

        res.innerHTML += `O número adicionado foi ${Number(n.value)} <br/>`

        n.value = ''
        n.focus()
        number.sort((a, b)=> b - a)

        if(number.length == 3){
            res.innerHTML = ``
            res.innerHTML += `<br/>Em ordem decrecente fica: <br/>`

            for(i = 0 ; i < number.length ; i++){
                res.innerHTML += `${i + 1}° É o número ${number[i]} <br/>`
            }
        }else{
            
        }
    }
}