const numeros = [42, 2, 100, 142]

const soma = numeros.reduce((acc, atual) => atual + acc, 0)

console.log(soma);