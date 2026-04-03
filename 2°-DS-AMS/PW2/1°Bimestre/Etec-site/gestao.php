<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/CSS/style.css" />
    <link rel="stylesheet" href="/CSS/gestão.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/remixicon@4.9.0/fonts/remixicon.css"
      rel="stylesheet"
    />
    <title>Etec-Zona Leste</title>
  </head>
  <body>
    <?php $pagina = "gestao"; include 'header.php'; ?>

    <aside class="nav-bar-lateral">
      <a href="#dashboard" class="link-lateral">
        <i class="ri-bar-chart-box-line"></i>
        <p>Dashboard</p>
      </a>

      <a href="#alunos" class="link-lateral">
        <i class="ri-user-5-line"></i>
        <p>Alunos</p>
      </a>

      <a href="#professor" class="link-lateral">
        <i class="ri-user-2-line"></i>
        <p>Professor</p>
      </a>

      <a href="#cursos" class="link-lateral">
        <i class="ri-graduation-cap-line"></i>
        <p>Cursos</p>
      </a>

      <a href="#premiacoes" class="link-lateral">
        <i class="ri-award-line"></i>
        <p>Premiações</p>
      </a>

      <a href="#agenda" class="link-lateral">
        <i class="ri-calendar-2-line"></i>
        <p>Agenda</p>
      </a>
    </aside>
    <main>
      <div class="titulos" id="dashboard">
        <h2>Dashboard <i class="ri-bar-chart-box-line"></i></h2>
      </div>

      <div class="dashboard">
        <div class="card-dashboard">
          <h3>Total de Alunos</h3>
          <p><span>1200</span> Alunos totais</p>
        </div>

        <div class="card-dashboard">
          <h3>Total de Professores</h3>
          <p><span>80</span> Professores totais</p>
        </div>

        <div class="card-dashboard">
          <h3>Total de Cursos</h3>
          <p><span>12</span> Cursos Totais</p>
        </div>

        <div class="card-dashboard">
          <h3>Porcetagem de Aprovados</h3>
          <p><span>92%</span> Aprovação de Alunos</p>
        </div>
      </div>

      <div class="titulos" id="alunos">
        <h2>Alunos <i class="ri-user-5-line"></i></h2>
      </div>

      <div class="alunos">
        <div class="tabela-melhores-alunos">
          <h3>Melhores Alunos</h3>
          <div>
            <span>Aluno</span>
            <span>Curso</span>
            <span>Média de notas</span>
          </div>
          <div>
            <h4>Antonio Bernadino</h4>
            <h5>3°DS-AMS</h5>
            <p>8.1/10</p>
          </div>
          <div>
            <h4>Julia Bergstron</h4>
            <h5>2°DS-AMS</h5>
            <p>7.7/10</p>
          </div>
          <div>
            <h4>Pedro Rodrigues</h4>
            <h5>2°DS-AMS</h5>
            <p>7.4/10</p>
          </div>
          <div>
            <h4>Derek Batinga</h4>
            <h5>2°DS-AMS</h5>
            <p>7.2/10</p>
          </div>
          <div>
            <h4>Rafael Nunes</h4>
            <h5>2°DS-AMS</h5>
            <p>7.1/10</p>
          </div>
        </div>
        <div class="tabela-alunos">
          <h3>Tabela de Alunos</h3>
          <div>
            <span>Curso</span>
            <span>Alunos</span>
          </div>
          <div>
            <h4>ADM</h4>
            <p>150</p>
          </div>
          <div>
            <h4>DS</h4>
            <p>150</p>
          </div>
          <div>
            <h4>DS-AMS</h4>
            <p>150</p>
          </div>
          <div>
            <h4>RH</h4>
            <p>150</p>
          </div>
          <div>
            <h4>LOG</h4>
            <p>150</p>
          </div>
          <div>
            <h4>SJ</h4>
            <p>150</p>
          </div>
        </div>
      </div>

      <div class="titulos" id="professor">
        <h2>Professores <i class="ri-user-2-line"></i></h2>
      </div>

      <div class="professores">
        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/professores/Carlinhos.png" alt="Carlinhos" />
          </div>
          <h2>Carlinhos</h2>
          <div>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Professor dos
              professores
            </p>
            <p><i class="ri-checkbox-blank-circle-fill"></i> Criador de BD</p>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Aulas de DS, BD, SE,
              PAM, FI, PW, DD e o que ele quiser.
            </p>
          </div>
        </div>

        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/professores/Ralf.png" alt="Ralf" />
          </div>
          <h2>Ralf</h2>
          <div>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Trabalhador do DTI
            </p>
            <p><i class="ri-checkbox-blank-circle-fill"></i> TI médio</p>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Aulas de Redes, DD, PW e Hardware.
            </p>
          </div>
        </div>

        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/professores/Gilmar.jpeg" alt="Gilmar" />
          </div>
          <h2>Gilmar</h2>
          <div>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Professor-Novo com potencial
            </p>
            <p><i class="ri-checkbox-blank-circle-fill"></i> Salvador de TPA</p>
            <p>
              <i class="ri-checkbox-blank-circle-fill"></i> Aulas de BD, PW e TPA.
            </p>
          </div>
        </div>
      </div>

      <div class="titulos" id="cursos">
        <h2>Cursos <i class="ri-graduation-cap-line"></i></h2>
      </div>

      <div class="alunos">
        <div class="tabela" id="tabela-popularidade">
          <h3 class="tabela-titulo">Tabela de Popularidade</h3>
          <div class="container-tabela">
            <div class="grafico">
              <div class="linha" style="bottom: -4%">0%</div>
              <div class="linha" style="bottom: 16%">20%</div>
              <div class="linha" style="bottom: 36%">40%</div>
              <div class="linha" style="bottom: 56%">60%</div>
              <div class="linha" style="bottom: 76%">80%</div>
              <div class="linha" style="bottom: 96%">100%</div>

              <div class="barra" data-valor="40%" style="height: 40%">
                <span>Administração</span>
              </div>
              <div class="barra" data-valor="65%" style="height: 65%">
                <span>Recursos Humanos</span>
              </div>
              <div class="barra destaque" data-valor="80%" style="height: 80%">
                <span>Serviço Jurídico</span>
              </div>
              <div class="barra" data-valor="75%" style="height: 75%">
                <span>DS</span>
              </div>
              <div class="barra" data-valor="45%" style="height: 45%">
                <span>Logistica</span>
              </div>
              <div class="barra" data-valor="40%" style="height: 40%">
                <span>Contabilidade</span>
              </div>
              <div class="barra destaque" data-valor="90%" style="height: 90%">
                <span>DS-AMS</span>
              </div>
            </div>
          </div>
          <div class="anos">
            <button class="ativo">2025</button>
            <button>2024</button>
            <button>2023</button>
            <button>2022</button>
            <button>2021</button>
          </div>
        </div>
        <div class="tabela-alunos">
          <h3>Tabela de Vagas</h3>
          <div>
            <span>Curso</span>
            <span>Vagas</span>
          </div>
          <div>
            <h4>ADM</h4>
            <p>35</p>
          </div>
          <div>
            <h4>DS</h4>
            <p>35</p>
          </div>
          <div>
            <h4>DS-AMS</h4>
            <p>40</p>
          </div>
          <div>
            <h4>RH</h4>
            <p>35</p>
          </div>
          <div>
            <h4>LOG</h4>
            <p>35</p>
          </div>
          <div>
            <h4>SJ</h4>
            <p>35</p>
          </div>
        </div>
      </div>

      <div class="titulos" id="premiacoes">
        <h2>Premiações <i class="ri-award-line"></i></h2>
      </div>

      <div class="professores">
        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/Feteps.webp" alt="FETEPS" />
          </div>
          <h2>FETEPS - 2025</h2>
          <p>Resultado: <span>2° Lugar</span></p>
          <p>Projeto: SecondVision (assistividade visual)</p>
        </div>

        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/CNIT.webp" alt="CNIT" />
          </div>
          <h2>Premiação no CNIT</h2>
          <p>Evento: <span>CNIT - Congresso Nacional Integra Portos</span></p>
          <p>Destaque: Program AMS da escola foi premiado</p>
        </div>

        <div class="card-professor">
          <div class="professor-img">
            <img src="/img/Torneio.webp" alt="Torneio" />
          </div>
          <h2>Torneio Educacional, Esportivo e Cultural</h2>
          <p>Resultado: <span>1° Lugar geral</span></p>
          <p>Competição entre várias ETECs</p>
        </div>
      </div>

      <div class="titulos" id="agenda">
        <h2>Agenda <i class="ri-calendar-2-line"></i></h2>
      </div>

      <div class="card-agenda">
        <h1>Veja os eventos do calendario - 2026</h1>
        <a href="/arquivos/Calendario-2026-1.pdf" download>
          <button>Baixar <i class="ri-download-2-line"></i></button>
        </a>
      </div>
    </main>
    <?php include 'footer.php'; ?>
  </body>
</html>
