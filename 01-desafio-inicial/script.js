const input = document.getElementById('tarefaInput');
const lista = document.getElementById('listaTarefas');
const btnAdicionar = document.getElementById('adicionarBtn');

let filtroAtual = 'todas';

function adicionarTarefa() {
  const texto = input.value.trim();
  if (texto === "") return;

  const li = document.createElement('li');

  const span = document.createElement('span');
  span.textContent = texto;
  span.classList.add("tarefa-texto");

  const acoes = document.createElement('div');
  acoes.classList.add("acoes");

  const btnConcluir = document.createElement('button');
  btnConcluir.textContent = "✔";
  btnConcluir.onclick = () => {
    span.classList.toggle("concluida");
    filtrar(filtroAtual);
  };

  const btnRemover = document.createElement('button');
  btnRemover.textContent = "✖";
  btnRemover.onclick = () => li.remove();

  acoes.appendChild(btnConcluir);
  acoes.appendChild(btnRemover);

  li.appendChild(span);
  li.appendChild(acoes);

  lista.appendChild(li);

  input.value = "";
  input.focus();

  filtrar(filtroAtual);
}

btnAdicionar.addEventListener("click", adicionarTarefa);

input.addEventListener("keypress", (e) => {
  if (e.key === "Enter") {
    adicionarTarefa();
  }
});

function filtrar(tipo) {
  filtroAtual = tipo;
  const tarefas = lista.querySelectorAll("li");
  tarefas.forEach(tarefa => {
    const texto = tarefa.querySelector("span");
    tarefa.style.display = "flex"; // reset
    if (tipo === "pendentes" && texto.classList.contains("concluida")) {
      tarefa.style.display = "none";
    }
    if (tipo === "concluidas" && !texto.classList.contains("concluida")) {
      tarefa.style.display = "none";
    }
  });
}