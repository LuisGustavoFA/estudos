// const sala1 = [7, 8, 8, 7, 10, 6.5, 4, 10, 7];
// const sala2 = [6, 5, 8, 9, 5, 6];
// const sala3 = [7, 3.5, 8, 9.5];

// let somaSala1 = 0;
// let somaSala2 = 0;
// let somaSala3 = 0;

// sala1.forEach((num) => somaSala1 += num);
// sala2.forEach((num) => somaSala2 += num);
// sala3.forEach((num) => somaSala3 += num);

// const mediaSala1 = somaSala1 / sala1.length;
// const mediaSala2 = somaSala2 / sala2.length;
// const mediaSala3 = somaSala3 / sala3.length;

// console.log(`Média sala 1: ${mediaSala1}. Média sala 2: ${mediaSala2}. Média sala 3: ${mediaSala3}. `);

const sala1 = [7, 8, 8, 7, 10, 6.5, 4, 10, 7];
const sala2 = [6, 5, 8, 9, 5, 6];
const sala3 = [7, 3.5, 8, 9.5];

function calculaMedia(notasSala) {
  const somaNotas = notasSala.reduce((acc, atual) => acc + atual, 0);
                                                             // ^ inicio acumulador (segundo parametro do reduce), soma a cada repetição.
  const media = somaNotas / notasSala.length;
  return media;
}

console.log(`A média das notas da Sala 1 é ${calculaMedia(sala1)}`);
console.log(`A média das notas da Sala 2 é ${calculaMedia(sala2)}`);
console.log(`A média das notas da Sala 3 é ${calculaMedia(sala3)}`);