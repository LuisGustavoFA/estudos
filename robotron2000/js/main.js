const imgRobotron = document.getElementById("robotron");
imgRobotron.addEventListener("click", () => {
  console.log("Iniciando sistemas de defesa.");
});
let cont = 0;

const botaoCor = document.querySelector("[data-cor]");
botaoCor.addEventListener("click", () => {
  cont++
  if(cont%2 == 0){
    imgRobotron.src = "./img/robotron_azul.png"
  } else {
    imgRobotron.src = "./img/robotron_preto.png"
  }
  // if (imgRobotron.src == "./img/robotron_preto.png") {
  //   imgRobotron.src = "./img/robotron_azul.png"
  //   console.log("a");
  // } else {
  //   imgRobotron.src = "./img/robotron_preto.png"
  //   console.log("b");
  //   console.log(imgRobotron.src);

  // }
});

const controle = document.querySelectorAll("[data-controle]");
const estatisticas = document.querySelectorAll("[data-estatistica]");
const pecas = {
  "bracos": {
      "forca": 29,
      "poder": 35,
      "energia": -21,
      "velocidade": -5
  },

  "blindagem": {
      "forca": 41,
      "poder": 20,
      "energia": 0,
      "velocidade": -20
  },
  "nucleos":{
      "forca": 0,
      "poder": 7,
      "energia": 48,
      "velocidade": -24
  },
  "pernas":{
      "forca": 27,
      "poder": 21,
      "energia": -32,
      "velocidade": 42
  },
  "foguetes":{
      "forca": 0,
      "poder": 28,
      "energia": 0,
      "velocidade": -2
  }
}

controle.forEach((elemento) => {  
  elemento.addEventListener("click", (evento) =>{
    manipulaDados(evento.target.dataset.controle, evento.target.parentNode);
    atualizaEstatisticas(evento.target.dataset.peca);
  })
})

function manipulaDados(operacao, controle) {
  const peca = controle.querySelector("[data-contador]");

  if (operacao === "-") {
    peca.value = parseInt(peca.value) - 1;
  } else {
    peca.value = parseInt(peca.value) + 1;  
  }
}

function atualizaEstatisticas(peca) {
  estatisticas.forEach((elemento) => {
    elemento.textContent = parseInt(elemento.textContent) + pecas[peca][elemento.dataset.estatistica];
  })
}
