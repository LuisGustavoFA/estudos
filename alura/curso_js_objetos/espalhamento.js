const cliente = {
  nome: "Joao",
  idade: 24,
  email: "joao@firma.com",
  telefone: ["1155555550", "1144444440"],
};

cliente.enderecos = [
  {
  rua: "R. Joseph Climber",
  numero: 1337,
  apartamento: true,
  complemento: "ap 934",
  }
];

function ligaParaCliente (tlfComercial, tlfResidencial) {
  console.log(`Ligando para ${tlfComercial} (comercial).`);
  console.log(`Ligando para ${tlfResidencial} (residencial).`);
}

ligaParaCliente(...cliente.telefone);

/////////////////////////////////////////////////////////////////////////////////////////

const encomenda = {
    destinatario: cliente.nome,
    ...cliente.enderecos[0],
}

console.log(encomenda);

/////////////////////////////////////////////////////////////////////////////////////////

const fichaGuerreiro = {
  nome: "Aragorn",
  classe: "guerreiro"
}
 
const equipoGuerreiro = {
  espada: "Andúril",
  capa: "capa élfica +2"
}

const guerreiro = { ...fichaGuerreiro, ...equipoGuerreiro }
console.log(guerreiro);
