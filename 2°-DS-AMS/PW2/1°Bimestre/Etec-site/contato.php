<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/CSS/style.css" />
    <link rel="stylesheet" href="/CSS/contato.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css"
      rel="stylesheet"
    />
    <title>Etec-Zona Leste</title>
  </head>
  <body>
    <?php
      $pagina = "contato";
      include 'header.php';
    ?>

    <main>
      <div class="container">
        <div class="titulos">
          <h2>Contato <i class="ri-contacts-line"></i></h2>
        </div>
        <form action="processar.php" method="post" class="form">
          <div class="pesquisar">
            <input
              type="text"
              name="nome"
              class="pesquisar-input"
              id="nome"
              placeholder=" "
            />
            <label for="nome"> Nome Completo </label>
          </div>
          <div class="pesquisar">
            <input
              type="text"
              name="email"
              class="pesquisar-input"
              id="e-mail"
              placeholder=" "
            />
            <label for="e-mail"> E-mail para Contato </label>
          </div>
          <div class="pesquisar">
            <input
              type="text"
              name="assunto"
              class="pesquisar-input"
              id="assunto"
              placeholder=" "
            />
            <label for="assunto"> Assunto </label>
          </div>
          <div class="pesquisar">
            <input
              type="text"
              name="mensagem"
              class="pesquisar-input"
              id="mensagem"
              placeholder=" "
            />
            <label for="mensagem"> Mensagem </label>
          </div>
          <button class="bnt" type="submit">Enviar</button>
        </form>
      </div>
    </main>
    <?php 
      include 'footer.php';
    ?>
  </body>
</html>
