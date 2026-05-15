<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabuada</title>
    <link rel="stylesheet" href="CSS/style.css">
    <link rel="shortcut icon" href="favicon.png" type="image/x-icon">
</head>
<body>
    <!-- Por favor Ralf ou Rebeca me deixe com MB S2 -_- -->
    <main>
        <section>
            <h1>Tabuada</h1>
            <input type="checkbox" name="clique" id="clique" hidden>
            <label for="clique" class="bnt">
                CLIQUE EM MIM!
            </label>

            <form id="formIdade" method="POST">
                <div class="digite">
                    <label for="nascimento">Digite o número para a tabuada:</label>
                    <input type="number" id="nascimento" name="txtnum" required>
                    <input type="submit" id="btnCalcular" value=" ✓ ">
                </div>
                <div class="resposta">
                    <h4>Resultado:</h4>
                    <p id="resultado">
                        <?php
                            $i = 0;
                            $num = $_POST["txtnum"];
                            while($i <= 10){
                                $tab = $num * $i;
                                echo "$num.X.$i = $tab <br/>";
                                $i++;
                            };
                        ?>
                    </p>
                </div>
            </form>
        </section>
    </main>
    
</body>
</html>