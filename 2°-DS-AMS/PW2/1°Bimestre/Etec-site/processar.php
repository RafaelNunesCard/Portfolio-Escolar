<?php
$mensagemSucesso = "";
$dados = [];

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $nome = htmlspecialchars($_POST["nome"] ?? "");
    $email = htmlspecialchars($_POST["email"] ?? "");
    $assunto = htmlspecialchars($_POST["assunto"] ?? "");
    $mensagem = htmlspecialchars($_POST["mensagem"] ?? "");

    $dados = compact("nome", "email", "assunto", "mensagem");

    $mensagemSucesso = "Mensagem enviada com sucesso!";
} else {
    $mensagemSucesso = "Acesso inválido!";
}
?>
<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/CSS/style.css" />
    <link rel="stylesheet" href="/CSS/processar.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css"
      rel="stylesheet"
    />
    <title>Etec-Zona Leste</title>
  </head>
  <body>
    <?php
      $pagina = "home";
      include 'header.php';
    ?>

    <main>
      <div class="card">

        <?php if ($_SERVER["REQUEST_METHOD"] == "POST"): ?>
          <div class="sucesso">
            <?= $mensagemSucesso ?>
          </div>

          <div class="info">
            <p><strong>Nome:</strong> <?= $dados["nome"] ?></p>
            <p><strong>Email:</strong> <?= $dados["email"] ?></p>
            <p><strong>Assunto:</strong> <?= $dados["assunto"] ?></p>
            <p><strong>Mensagem:</strong> <?= $dados["mensagem"] ?></p>
          </div>

        <?php else: ?>
          <div class="erro">
            <?= $mensagemSucesso ?>
          </div>
        <?php endif; ?>

        <a href="contato.php" class="btn">Voltar</a>

      </div>
    </main>

    <?php 
      include 'footer.php';
    ?>
  </body>
</html>