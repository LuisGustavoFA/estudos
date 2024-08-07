const dados = require("./clientes.json");
let numero = ["primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo", "décimo primeiro", "décimo segundo", "décimo terceiro", "décimo quarto", "décimo quinto", "décimo sexto", "décimo sétimo", "décimo oitavo", "décimo nono", "vigésimo"];
let iteracao = 0;

const nomes = dados.filter((nomes) => {
  nomes = nomes.nome
  console.log(`O ${numero[iteracao]} nome é ${nomes}.`);
  iteracao++;
});