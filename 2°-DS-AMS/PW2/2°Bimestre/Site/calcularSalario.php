<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina de Calculo de Salario</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="form">
        <?php
            if($_SERVER["REQUEST_METHOD"] == "POST"){
                $horas = $_POST["txthoras"];
                $valor = $_POST["txtvalor"];
                $salario = $horas * $valor;
                echo "<h1>O salario é: R$ " . number_format($salario, 2, ",", ".") . "</h1>";
            }
        ?>
    </div>
</body>
</html>