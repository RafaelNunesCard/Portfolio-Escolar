<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculo de Salario</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form action="calcularSalario.php" method="post" class="form">

        <h1>Formulário de Cálculo de Salário</h1>

        <div class="pesquisar">
            <input type="text" name="txthoras" class="pesquisar-input"><br>
            <label for="texthoras"> Digite as horas trabalhadas:</label>
        </div>

        <div class="pesquisar">
            <input type="text" name="txtvalor" class="pesquisar-input"><br>
            <label for="textvalor"> Digite o valor da hora trabalhada:</label>
        </div>

        <div class="botoes">
            <input type="submit" value="Calcular" class="bnt">
            <input type="reset" value="Limpar" class="bnt">
        </div>
    </form>
</body>
</html>