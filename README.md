

# Sistema de Compra de Ingressos - Cinema

## Descrição

Este projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas da faculdade CESMAC. O sistema permite que os usuários escolham filmes, selecione ingressos, escolham a sessão e ainda adicionem lanches e bebidas à sua compra.

### Funcionalidades:

- **Escolha de Filme**: O usuário pode escolher entre filmes de terror e ficção científica.
- **Seleção de Sessão**: O sistema oferece horários disponíveis para os filmes selecionados.
- **Compra de Ingressos**: O usuário pode selecionar ingressos inteiros e de meia entrada.
- **Compra de Lanches**: O sistema oferece a opção de comprar pipoca, refrigerante e chocolate. O usuário pode escolher múltiplos itens em uma única interação.
- **Resumo da Compra**: Ao final, o sistema exibe um resumo da compra com todos os detalhes de ingressos e lanches.
- **Confirmação de Compra**: Antes de finalizar, o usuário pode confirmar a compra.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Paradigma de Programação**: Programação Orientada a Objetos
- **Bibliotecas**: Nenhuma biblioteca externa foi utilizada para este projeto, apenas as classes padrão do Java, como `Scanner` e `ArrayList`.

## Como Executar

### Pré-requisitos

- **Java 14 ou superior**: A partir da versão 14 do Java, algumas funcionalidades (como o `switch` com expressões) são suportadas. Certifique-se de ter uma versão compatível instalada em seu sistema.

### Passos

1. **Clone este repositório**:
   - No terminal ou prompt de comando, navegue até o diretório desejado para o projeto e execute o comando:
     ```bash
     git clone https://github.com/vitfreire/CinemaSystem.git
     ```

2. **Navegue até o diretório do projeto**:
   - Entre no diretório do projeto:
     ```bash
     cd CinemaSystem
     ```

3. **Compile o código**:
   - Compile o arquivo `CinemaSystem.java` com o comando:
     ```bash
     javac CinemaSystem.java
     ```

4. **Execute o programa**:
   - Após a compilação, execute o programa com:
     ```bash
     java CinemaSystem
     ```

## Estrutura do Projeto

O projeto consiste em um único arquivo Java:

- **CinemaSystem.java**: Arquivo principal contendo a lógica do sistema de compras de ingressos, escolha de filmes, seleção de sessões, e compra de lanches.

## Observações

Este sistema foi implementado com foco na simulação de um processo de compra no cinema. O código é orientado a objetos, sendo simples e didático, adequado para a disciplina de Programação Orientada a Objetos.
