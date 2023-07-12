const notas = [10, 6.5, 8, 7.5];
let somaNotas = 0;

notas.forEach(function (nota, /*indice*/) {
  somaNotas += nota;
});

mediaNotas = somaNotas / notas.length;

console.log(mediaNotas);