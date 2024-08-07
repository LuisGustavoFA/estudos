const cliente = {
  nome: "André",
  idade: 32,
  cpf: "032.873.219-04",
  email: "andre@dominio.com",
};

console.log(`O nome do cliente é ${cliente["nome"]}, e possui ${cliente["idade"]} anos. O seu CPF é ***.${cliente["cpf"].substring(4, 7)}.***-*.`);

const chaves = ["nome", "idade", "cpf", "email"];

chaves.forEach((chave) => {
  console.log(`A chave ${chave} tem valor ${cliente[chave]}`);
})