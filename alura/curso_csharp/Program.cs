string boasVindas = "Boas Vindas ao Screen Sound!";
Dictionary<string, List<int>> bandas = new Dictionary<string, List<int>>();
bandas.Add("Pink Floyd", new List<int>{10, 2, 8});
bandas.Add("AC/DC", new List<int>());

void ExibeLogo() {
  Console.WriteLine(@"
░██████╗░█████╗░██████╗░███████╗███████╗███╗░░██╗  ░██████╗░█████╗░██╗░░░██╗███╗░░██╗██████╗░
██╔════╝██╔══██╗██╔══██╗██╔════╝██╔════╝████╗░██║  ██╔════╝██╔══██╗██║░░░██║████╗░██║██╔══██╗
╚█████╗░██║░░╚═╝██████╔╝█████╗░░█████╗░░██╔██╗██║  ╚█████╗░██║░░██║██║░░░██║██╔██╗██║██║░░██║
░╚═══██╗██║░░██╗██╔══██╗██╔══╝░░██╔══╝░░██║╚████║  ░╚═══██╗██║░░██║██║░░░██║██║╚████║██║░░██║
██████╔╝╚█████╔╝██║░░██║███████╗███████╗██║░╚███║  ██████╔╝╚█████╔╝╚██████╔╝██║░╚███║██████╔╝
╚═════╝░░╚════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═╝░░╚══╝  ╚═════╝░░╚════╝░░╚═════╝░╚═╝░░╚══╝╚═════╝░
");
  Console.WriteLine(boasVindas);
}

void ExibeMenu() {
  ExibeLogo();
  Console.WriteLine("\nDigite 1 para registrar uma banda");
  Console.WriteLine("Digite 2 para mostrar todas as banda");
  Console.WriteLine("Digite 3 para avaliar uma banda");
  Console.WriteLine("Digite 4 para exibir a média de uma banda");
  Console.WriteLine("Digite -1 para sair");
  Console.Write("\nDigite a sua opção: ");
  string opcaoEscolhida = Console.ReadLine()!;

  switch (int.Parse(opcaoEscolhida)) {
    case 1: RegistrarBanda();
      break;
    case 2: MostrarBandas();
      break;
    case 3: AvaliaBanda();
      break;
    case 4: MostrarMedias();
      break;
    case -1: Console.WriteLine("-Programa encerrado-");
      break;
    default: Console.WriteLine("Opção inválida");
      break;
  }
}

void CriaSubtitulos(string subtitulo) {
  int tamanho = subtitulo.Length;
  string asteriscos = string.Empty.PadLeft(tamanho, '*');

  Console.WriteLine(asteriscos);
  Console.WriteLine(subtitulo);
  Console.WriteLine(asteriscos + "\n");  
}

void RegistrarBanda() {
  Console.Clear();
  CriaSubtitulos("Registro de Bandas");
  Console.Write("Digite o nome da banda que deseja registrar: ");
  string nomeDaBanda = Console.ReadLine()!;
  bandas.Add(nomeDaBanda, new List<int>());
  Console.WriteLine($"A banda {nomeDaBanda} foi registrada com sucesso.");
  Thread.Sleep(2000);
  Console.Clear();
  ExibeMenu();
}

void MostrarBandas() {
  Console.Clear();
  CriaSubtitulos("Exibição de Bandas");
  Console.WriteLine("Bandas Registradas:");
  foreach (string banda in bandas.Keys) {
    Console.WriteLine($"- {banda}");
  }
  Console.WriteLine("\nDigite uma tecla para voltar ao menu principal");
  Console.ReadKey();
  Console.Clear();
  ExibeMenu();
}

void AvaliaBanda() {
  Console.Clear();
  CriaSubtitulos("Avaliar Bandas");
  Console.Write("Digite o nome da banda a avaliar: ");
  string bandaEscolhida = Console.ReadLine()!;
  if (bandas.ContainsKey(bandaEscolhida)) {
    Console.Write($"Nota que {bandaEscolhida} merece: ");
    int nota = int.Parse(Console.ReadLine()!);
    bandas[bandaEscolhida].Add(nota);
    Console.WriteLine($"\nA nota {nota} foi registra com sucesso para a banda {bandaEscolhida}.");
    Thread.Sleep(2000);
    Console.Clear();
    ExibeMenu();

  } else {
    Console.WriteLine($"\nA banda {bandaEscolhida} não foi encontrada.");
    Console.WriteLine("\nDigite uma tecla para voltar ao menu principal");
    Console.ReadKey();
    Console.Clear();
    ExibeMenu();
  }
}

void MostrarMedias() {
  Console.Clear();
  CriaSubtitulos("Médias das Bandas");
  Console.Write("Digite o nome da banda a verificar: ");
  string bandaEscolhida = Console.ReadLine()!;
  
  if (bandas.ContainsKey(bandaEscolhida)) {
    if (bandas[bandaEscolhida].Count() > 0) {
      Console.WriteLine($"- {bandaEscolhida} | nota: {bandas[bandaEscolhida].Average()}");
      Thread.Sleep(3000);
      Console.Clear();
      ExibeMenu();
     } else {
      Console.WriteLine($"- {bandaEscolhida} | nota: nenhuma nota registrada.");
      Thread.Sleep(3000);
      Console.Clear();
      ExibeMenu();
     }
  } else {
    Console.WriteLine($"\nA banda {bandaEscolhida} não foi encontrada.");
    Console.WriteLine("\nDigite uma tecla para voltar ao menu principal");
    Console.ReadKey();
    Console.Clear();
    ExibeMenu();
  }
}

ExibeMenu();

// void jogoTeste() {
//   Random rng = new Random();
//   int numeroAleatorio = rng.Next(1, 101);
//   Console.WriteLine("Escolha um número de 1 até 100.");
//   int tentativas = 5;

//   while (tentativas > 0) {
//     string numeroEscolhido = Console.ReadLine()!;

//     if (int.Parse(numeroEscolhido) == numeroAleatorio) {
//       Console.WriteLine($"Acertou! O número era {numeroAleatorio}.");
//       break;
//     } else if (int.Parse(numeroEscolhido) > numeroAleatorio) {
//       Console.WriteLine("O número é menor que o escolhido.");
//       tentativas--;
//       Console.WriteLine($"Tentativas restantes: {tentativas}.");
//     } else if (int.Parse(numeroEscolhido) < numeroAleatorio) {
//       Console.WriteLine("O número é maior que o escolhido.");
//       tentativas--;
//       Console.WriteLine($"Tentativas restantes: {tentativas}.");
//     } else Console.WriteLine("Número inválido");
//   }

//   if (tentativas == 0) {
//     Console.WriteLine("Acabaram as chances. O número era " + numeroAleatorio + ".");
//   }

//   Console.WriteLine("Finalizado.");
// }