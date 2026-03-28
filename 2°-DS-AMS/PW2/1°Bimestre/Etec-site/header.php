<header>
  <div class="logo">
    <img src="/img/Logo-Etec.png" alt="Logo-Etec" />
  </div>

  <nav>
    <ul>
      <li>
        <a
          href="index.php"
          class="<?= $pagina == 'home' ? 'link-ativado' : '' ?>"
        >
          Home
        </a>
      </li>

      <li class="menu-pai">
        <a
          href="cursos.php"
          class="<?= $pagina == 'cursos' ? 'link-ativado' : '' ?>"
        >
          Cursos<i class="ri-arrow-down-s-line"></i>
        </a>
        <div class="popup">
          <a href="cursos.php">Cursos Técnicos</a>
          <a href="cursos.php">Ensino Médio Integrado</a>
          <a href="cursos.php">Articulação</a>
        </div>
      </li>

      <li>
        <a
          href="gestao.php"
          class="<?= $pagina == 'gestao' ? 'link-ativado' : '' ?>"
        >
          Gestão
        </a>
      </li>

      <li>
        <a
          href="contato.php"
          class="<?= $pagina == 'contato' ? 'link-ativado' : '' ?>"
        >
          Contato
        </a>
      </li>
    </ul>
  </nav>

  <div class="pesquisar">
    <input type="text" class="pesquisar-input" id="pesquisar" placeholder=" " />
    <label for="pesquisar"> O que deseja localizar? </label>
    <i class="ri-search-line"></i>
  </div>
</header>
