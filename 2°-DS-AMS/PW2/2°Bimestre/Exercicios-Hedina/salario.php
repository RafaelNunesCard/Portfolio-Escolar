<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Salário</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>DESCUBRA SEU SALARIO</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite seu salário:</label>
                    <input type="number" id="nascimento" name="txtsalario" step="0.01" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php
                            $salario = (float)($_POST["txtsalario"] ?? 1621);
                            $gratificacao = 0.1;
                            $imposto = 0.2;
                            
                            function calculoSalario($valor, $gratificacao, $imposto) {
                                $valor += $valor * $gratificacao;
                                $valor -= $valor * $imposto;
                                return $valor;
                            }
                            
                            $sLiquido = calculoSalario($salario, $gratificacao, $imposto);
                            echo "Salário líquido é de: R$ $sLiquido";
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>