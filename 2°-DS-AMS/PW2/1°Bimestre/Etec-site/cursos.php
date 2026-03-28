<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/CSS/style.css" />
    <link rel="stylesheet" href="/CSS/cursos.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css"
      rel="stylesheet"
    />
    <title>Etec-Zona Leste</title>
  </head>
  <body>
    <?php
      $pagina = "cursos";
      include 'header.php';
    ?>
    <main>
      <div class="container1">
        <div class="titulos">
          <h2>Cursos <i class="ri-graduation-cap-line"></i></h2>
        </div>
        <div class="pesquisar" id="pesquisar-cursos">
          <input
            type="text"
            name="curso"
            class="pesquisar-input"
            id="pesquisar-curso"
            placeholder=" "
          />
          <label for="pesquisar-curso"> Nome do Curso ou Modalidade </label>
          <i class="ri-search-line"></i>
        </div>
      </div>
      <div class="cursos">
        <div class="curso">
          <img src="img/cursos/DS.png" alt="Desenvolvimento de Sistemas" />
          <div class="curso-texto">
            <h2>Desenvolvimento de Sistemas</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/AMS.png" alt="Desenvolvimento de Sistemas AMS" />
          <div class="curso-texto">
            <h2>Médio Técnico Desenvolvimento de Sistemas AMS (Tarde)</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/Adm.jpg" alt="Administração" />
          <div class="curso-texto">
            <h2>Administração</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/Log.png" alt="Logistica" />
          <div class="curso-texto">
            <h2>Logistica</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/SJ.jpg" alt="Serviço Jurdico" />
          <div class="curso-texto">
            <h2>Serviço Jurdico</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/RH.png" alt="Recursos Humanos" />
          <div class="curso-texto">
            <h2>Recursos Humanos</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>

        <div class="curso">
          <img src="img/cursos/Calculadora.jpg" alt="Contabilidade" />
          <div class="curso-texto">
            <h2>Contabilidade</h2>
            <p>
              <i class="ri-checkbox-fill"></i> Cursos Técnicos - modalidade
              presencial
            </p>
            <i class="ri-arrow-right-line"></i>
          </div>
        </div>
      </div>
    </main>
    <?php 
      include 'footer.php';
    ?>
  </body>
</html>
