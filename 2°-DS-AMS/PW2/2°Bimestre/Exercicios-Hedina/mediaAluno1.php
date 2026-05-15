<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Média</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>CÁLCULO DE MÉDIA</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite suas notas:</label>
                    <input type="number" id="nascimento" name="txtnota1" required>
                    <input type="number" id="nascimento" name="txtnota2" required>
                    <input type="number" id="nascimento" name="txtnota3" required>
                    <input type="number" id="nascimento" name="txtnota4" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php 
                            $nota1 = (int)($_POST["txtnota1"] ?? 0);
                            $nota2 = (int)($_POST["txtnota2"] ?? 0);
                            $nota3 = (int)($_POST["txtnota3"] ?? 0);
                            $nota4 = (int)($_POST["txtnota4"] ?? 0);
                            
                            function calcularMedia($n1,$n2,$n3,$n4){ return ($n1+$n2+$n3+$n4)/4; }
                            $media = calcularMedia($nota1,$nota2,$nota3,$nota4);
                            echo "Média: " . $media . "<br>";
                            echo ($media >= 5) ? "Aprovado" : "Reprovado";
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>