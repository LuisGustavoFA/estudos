const notas = [10, 6.5, 8, 7.5];
let somaNotas = 0;

for (i = 0; i < notas.length; i++) {
  somaNotas += notas[i];
}

const mediaNotas = somaNotas / notas.length;
console.log(`A médias das ${notas.length} notas é ${mediaNotas.toFixed(1)}.`);