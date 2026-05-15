<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Desconto</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>DESCUBRA SEU DESCONTO</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite o valor e o desconto:</label>
                    <input type="text" id="nascimento" name="txtValor" required>
                    <input type="text" id="nascimento" name="txtDesconto" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php 
                            $valor = (int)($_POST["txtValor"] ?? 0);
                            $desconto = (int)($_POST["txtDesconto"] ?? 0);
                            
                            function aplicarDesc($valor, $desc){return $valor - ($valor * ($desc / 100));}
                            $newValor = aplicarDesc($valor,$desconto);
                            echo "Valor novo: R$ " . number_format($newValor, 2, ',', '.');
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>