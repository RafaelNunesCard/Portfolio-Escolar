<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Troca de Variáveis</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>DESCUBRA A TROCA DE VARIÁVEIS</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="post">
                <div class="digite">
                    <label for="nascimento">Digite os valores de A e B:</label>
                    <input type="number" id="nascimento" name="txtA" required>
                    <input type="number" id="nascimento" name="txtB" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php
                            $a = $_POST["txtA"] ?? "";
                            $b = $_POST["txtB"] ?? "";

                            function trocarVariavel($A, $B) {
                                $temp = $A;
                                $A = $B;
                                $B = $temp;
                                return [$A, $B];
                            }

                            [$a, $b] = trocarVariavel($a, $b);
                            echo "Após a troca: A = $a e B = $b";
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>