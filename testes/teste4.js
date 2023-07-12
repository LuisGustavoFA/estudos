function soma(num1, operacao, num2) {
  if (operacao == "somar" || operacao == "+") {
    return num1 + num2;
  }
  if (operacao == "subtrair" || operacao == "-") {
    return num1 - num2;
  }
  if (operacao == "multiplicar" || operacao == "x") {
    return num1 * num2;
  }
  if (operacao == "dividir" || operacao == "/") {
    return num1 / num2;
  }
}

const op = {
  mais: "somar",
  menos: "subtrair",
  vezes: "multiplicar",
  div: "dividir"
}

console.log(soma(40, op.menos, 31));