
<style>
  .calc-wrap { max-width: 340px; margin: 1.5rem auto; }
  .display { background: var(--color-background-secondary); border: 0.5px solid var(--color-border-tertiary); border-radius: var(--border-radius-lg); padding: 1rem 1.25rem; margin-bottom: 1rem; }
  .display-expr { font-size: 13px; color: var(--color-text-secondary); min-height: 18px; margin-bottom: 4px; font-family: var(--font-mono); }
  .display-result { font-size: 32px; font-weight: 500; color: var(--color-text-primary); font-family: var(--font-mono); text-align: right; word-break: break-all; }
  .fields { display: grid; grid-template-columns: 1fr 80px 1fr; gap: 8px; margin-bottom: 1rem; }
  .fields input, .fields select { text-align: center; font-family: var(--font-mono); }
  .btn-calc { width: 100%; padding: 10px; font-size: 15px; font-weight: 500; cursor: pointer; }
  .error { color: var(--color-text-danger); font-size: 13px; min-height: 18px; text-align: center; margin-top: 6px; }
  .op-label { font-size: 12px; color: var(--color-text-secondary); text-align: center; margin-bottom: 4px; }
  .grid-labels { display: grid; grid-template-columns: 1fr 80px 1fr; gap: 8px; margin-bottom: 2px; }
</style>

<h2 class="sr-only">Calculadora de quatro operações básicas</h2>

<div class="calc-wrap">
  <div class="display">
    <div class="display-expr" id="expr">&nbsp;</div>
    <div class="display-result" id="result">0</div>
  </div>

  <div class="grid-labels">
    <div class="op-label">Valor A</div>
    <div class="op-label">Operador</div>
    <div class="op-label">Valor B</div>
  </div>
  <div class="fields">
    <input type="number" id="valA" placeholder="0" value="" step="any" />
    <select id="op">
      <option value="+">+</option>
      <option value="-">−</option>
      <option value="*">×</option>
      <option value="/">÷</option>
    </select>
    <input type="number" id="valB" placeholder="0" value="" step="any" />
  </div>

  <button class="btn-calc" onclick="calcular()">Calcular</button>
  <div class="error" id="erro"></div>
</div>

<script>
  function calcular() {
    const a = parseFloat(document.getElementById('valA').value);
    const b = parseFloat(document.getElementById('valB').value);
    const op = document.getElementById('op').value;
    const exprEl = document.getElementById('expr');
    const resultEl = document.getElementById('result');
    const erroEl = document.getElementById('erro');

    erroEl.textContent = '';

    if (isNaN(a) || isNaN(b)) {
      erroEl.textContent = 'Preencha os dois valores.';
      exprEl.innerHTML = '&nbsp;';
      resultEl.textContent = '—';
      return;
    }

    const opDisplay = { '+': '+', '-': '−', '*': '×', '/': '÷' };
    let res;

    switch (op) {
      case '+': res = a + b; break;
      case '-': res = a - b; break;
      case '*': res = a * b; break;
      case '/':
        if (b === 0) {
          erroEl.textContent = 'Erro: divisão por zero não é permitida.';
          exprEl.textContent = `${a} ÷ ${b}`;
          resultEl.textContent = '∞';
          return;
        }
        res = a / b;
        break;
    }

    exprEl.textContent = `${a} ${opDisplay[op]} ${b} =`;

    const fmt = Number.isInteger(res) ? res.toString() : parseFloat(res.toFixed(10)).toString();
    resultEl.textContent = fmt;
  }

  document.addEventListener('keydown', e => { if (e.key === 'Enter') calcular(); });
</script>
