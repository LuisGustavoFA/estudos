function numsAleatorios (quantia) {
  const nums = [];
  for (i=nums.length; i < quantia; i++) {  
      var numero = Math.ceil((Math.random()*50));
      if (nums.includes(numero)) {
        i--;
      } else {
        nums.push(numero);
      }
  }

  nums.sort ((a, b) => a - b);
  return nums;
  
}

var queroAchar = [];
function numsSorte (numero, tentativas) {
  queroAchar.push(numero);

  for (var i=0;i<tentativas;i++) {
    var h;
    h = (numsAleatorios(queroAchar.length)); 
    if (h.includes(numero)) {
      console.log(`Os números foram encontrados na tentativa ${i + 1} teste ${h, numero}!`);
      break;
    } else {
      console.log(h, numero);
    }
  }
}

numsSorte(42, 10);