const alunos = ["João", "Juliana", "Ana", "Caio"];
const notas = [10, 8, 7.5, 9];

const alunosEMedias = [alunos, notas];

const exibeNomeENota = function (aluno) {
  if (alunosEMedias[0].includes(aluno)) {
    //const alunos = alunosEMedias[0];
    //const notas = alunosEMedias[1];

    const [alunos, notas] = alunosEMedias;
    const indice = alunos.indexOf(aluno);
    const notaDoAluno = notas[indice];

    console.log(`${aluno} está registrado(a). Sua nota é ${notaDoAluno}`);  
  } else {
    console.log(`${aluno} não está no registro de alunos.`);
  }
}

exibeNomeENota('Ana');