const dados = require("./cliente.json");

console.log(dados);
console.log(typeof dados);
console.log("--------------------------------------------------");

const clienteEmString = JSON.stringify(dados);

console.log(clienteEmString);
console.log(typeof clienteEmString);
console.log("--------------------------------------------------");

const clienteEmObjeto = JSON.parse(clienteEmString);

console.log(clienteEmObjeto);
console.log(typeof clienteEmObjeto);