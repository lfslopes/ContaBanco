# Conta Bancária - Desafio Java Básico DIO

Projeto criado com base nas instruções do desafio presente em *[DIO - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)*

## Qual o desafio desse projeto?

Criar um programa que lerá pelo terminal as informações passadas pelo usuário acerca de sua conta bancária
Essas informações seriam:

* Nome do usuário
* Agência bancária
* Número da conta
* Saldo inicial

Para isso, foram declarados quatro variáveis:

| Variável | Tipo    | Código                 |
|----------|---------|------------------------|
| Nome     | texto   | ``String nomeCliente`` |
| Agência  | texto   | ``String agencia``     |
| Número   | inteiro | ``int numero``         |
| Saldo    | decimal | ``double saldo``       |

Com o classe ``Scanner`` é possível criar um objeto com métodos para ler a entrada do usuário no terminal.

Criando um objeto *Scanner*, o código realiza a leitura dos dados do usuário com os métodos da classe, como ``scanner.next()``, ``scanner.nextInt()`` e ``scanner.nextDouble()``.