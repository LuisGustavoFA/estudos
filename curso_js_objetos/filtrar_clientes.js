const clientes = require("./clientes.json");

function flitrarApsSemComplemento(clientes) {
  return clientes.filter((cliente) => {
    return cliente.endereco.apartamento && !cliente.endereco.hasOwnProperty("complemento")
  })
}

const filtrados = flitrarApsSemComplemento(clientes);
console.log(filtrados);