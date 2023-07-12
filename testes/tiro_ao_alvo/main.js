const tela = document.querySelector('canvas');
const pincel = tela.getContext('2d');
const botao = document.getElementById('inicio');
const raio = 15;
let xR;
let yR;

function desenhaCirculo(x, y, raio, cor) {
  pincel.fillStyle = cor;
  pincel.beginPath();
  pincel.arc(x, y, raio, 0, 2 * Math.PI);
  pincel.fill();
}

function limpaTela() {
  pincel.clearRect(0, 0, 1000, 600);
}

function desenhaAlvo(x, y) {
  desenhaCirculo(x, y, raio + 20, 'red');
  desenhaCirculo(x, y, raio + 10, 'white');
  desenhaCirculo(x, y, raio, 'red');
}

tela.addEventListener('click', (evento) => {
  const x = evento.pageX - tela.offsetLeft;
  const y = evento.pageY - tela.offsetTop;

  if (x >= xR - raio && x <= xR + raio && y >= yR - raio && y <= yR + raio) {
    alert('acertou!!');
  }
});

let intervalo;
let comecou = false
botao.addEventListener('click', ()=>{
  if (comecou == false) {
    intervalo = setInterval(() => {
      limpaTela();
      xR = Math.floor(Math.random() * 1000);
      yR = Math.floor(Math.random() * 600);
      desenhaAlvo(xR, yR);
    }, 900);
    botao.innerText = 'FINALIZAR';
  } else {
    clearInterval(intervalo);
    limpaTela();
    botao.innerText = 'INICIAR';
  }
  comecou = !comecou;
})

