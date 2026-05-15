<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Soma dos Ímpares</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>DESCUBRA A SOMA DOS NÚMEROS ÍMPARES</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite o intervalo:</label>
                    <input type="number" id="nascimento" name="txtInicial" required>
                    <input type="number" id="nascimento" name="txtFinal" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php  
                            $inicial = (int)($_POST["txtInicial"] ?? 0);
                            $final = (int)($_POST["txtFinal"] ?? 0);
                            $soma = 0;
                            
                            for($i = $inicial; $i < $final; $i++){
                                if($i % 2 == 1) $soma += $i;
                            };
                            echo "A soma dos numeros impares do intevalo é de: $soma";
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>