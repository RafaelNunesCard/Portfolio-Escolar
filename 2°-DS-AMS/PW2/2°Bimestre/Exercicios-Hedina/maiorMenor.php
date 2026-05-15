<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MAIOR E MENOR</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>MAIOR E MENOR</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite três números:</label>
                    <input type="number" id="nascimento" name="txtNum1" required>
                    <input type="number" id="nascimento" name="txtNum2" required>
                    <input type="number" id="nascimento" name="txtNum3" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php 
                            $num1 = (int)($_POST["txtNum1"] ?? 0);
                            $num2 = (int)($_POST["txtNum2"] ?? 0);
                            $num3 = (int)($_POST["txtNum3"] ?? 0);
                            
                            $nums = [$num1, $num2, $num3];
                            rsort($nums);
                            
                            for($i = 0; $i < count($nums); $i++){
                                echo "[" . $i . "]- " . $nums[$i] . "<br>";
                            }
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>