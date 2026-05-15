<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Soma dos Quadrados</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>DESCUBRA A SOMA DOS QUADRADOS</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite os 3 números:</label>
                    <input type="number" id="nascimento" name="txtNum1" required>
                    <input type="number" id="nascimento" name="txtNum2" required>
                    <input type="number" id="nascimento" name="txtNum3" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php
                            $num1 = (float)($_POST["txtNum1"] ?? 0);
                            $num2 = (float)($_POST["txtNum2"] ?? 0);
                            $num3 = (float)($_POST["txtNum3"] ?? 0);
                            
                            function somaQuadrados($n1, $n2, $n3) {
                                return pow($n1,2) + pow($n2,2) + pow($n3,2);
                            }
                            
                            $soma = somaQuadrados($num1, $num2, $num3);
                            echo "Soma dos quadrados dos números é de: $soma";
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>