function geraSemRepetido(quantia) {
  let final = [];
  for (i=0;i<quantia;i++) {
    let gerado = Math.ceil(Math.random()*10);
    if(!final.includes(gerado)) {
      final.push(gerado);
    } else {
      i--;
    }
  }
  return final;
}
console.log(geraSemRepetido(3));