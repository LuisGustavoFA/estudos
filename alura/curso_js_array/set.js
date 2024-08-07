// const nomes = ["Ana", "Clara", "Maria", "Maria", "João", "João", "João"];

// const meuSet = new Set(nomes);
// const semRepetidos = [...meuSet];

// console.log(semRepetidos);

const nomes = ["Ana", "Clara", "Maria", "Maria", "João", "João", "João"];

const semRepetidos = [...new Set(nomes)];
console.log(semRepetidos);