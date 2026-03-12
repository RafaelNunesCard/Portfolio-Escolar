<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $nome = $_POST['nome'] ?? "";
        $idade = $_POST['idade'] ?? "";

        if($nome == "" || $idade == ""){
            echo "Campos obrigatórios";
            return;
        }

        echo "Seu nome é: $nome";
        echo "<br>";
        echo "Sua idade é: $idade" ;
    ?>
</body>
</html>