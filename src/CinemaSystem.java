package src;

import java.util.Scanner;

public class CinemaSystem {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Lista de filmes disponíveis
        String[] filmes = {
                "1. O Exorcista - Terror",
                "2. A Noite dos Mortos-Vivos - Terror",
                "3. Interestelar - Ficção Científica",
                "4. Blade Runner - Ficção Científica"
        };

        // Valores de ingressos
        int ingressoInteiro = 32;
        int ingressoMeia = 16;

        // Inicialização do Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Boas-vindas e exibição dos filmes
        System.out.println("Bem-vindo ao Cinema CenterPlex!");
        System.out.println("Escolha um filme do catalogo:");

        for (String filme : filmes) {
            System.out.println(filme);
        }

        // Escolha do filme
        System.out.print("Digite o número do filme desejado: ");
        int escolhaFilme = scanner.nextInt();

        if (escolhaFilme < 1 || escolhaFilme > filmes.length) {
            System.out.println("Opção inválida. Reinicie o programa.");
            return;
        }

        String filmeEscolhido = filmes[escolhaFilme - 1].substring(3); // Remove o número do filme
        System.out.println("Você escolheu: " + filmeEscolhido);

        // Exibição dos preços dos ingressos
        System.out.println("\nPreços dos ingressos:");
        System.out.println("1. Ingresso Inteiro: R$ " + ingressoInteiro);
        System.out.println("2. Ingresso Meia Entrada: R$ " + ingressoMeia);

        // Compra dos ingressos
        System.out.print("\nDigite a quantidade de ingressos inteiros: ");
        int ingressosInteiros = scanner.nextInt();

        System.out.print("Digite a quantidade de ingressos meia entrada: ");
        int ingressosMeiaEntrada = scanner.nextInt();

        // Calcular o valor total dos ingressos
        int totalIngressos = (ingressosInteiros * ingressoInteiro) + (ingressosMeiaEntrada * ingressoMeia);
        System.out.println("\nTotal de ingressos: R$ " + totalIngressos);

        // Compra de lanches
        double totalComidas = 0;
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("\nVocê deseja comprar lanches? (S/N): ");
        String respostaLanches = scanner.nextLine().toUpperCase();

        if (respostaLanches.equals("S")) {
            System.out
                    .println("\nAgora, escolha os itens de comida (selecione múltiplos itens separados por vírgula):");
            System.out.println("1. Pipoca Pequena (R$ 10)");
            System.out.println("2. Pipoca Média (R$ 15)");
            System.out.println("3. Pipoca Grande (R$ 20)");
            System.out.println("4. Refrigerante - Coca Cola (R$ 8)");
            System.out.println("5. Refrigerante - Fanta (R$ 7)");
            System.out.println("6. Refrigerante - Guaraná (R$ 8)");
            System.out.println("7. Chocolate Alpino (R$ 7)");

            System.out.print("\nDigite os números dos itens desejados (separados por vírgula): ");
            String escolhaComidas = scanner.nextLine();

            // Divide a entrada em um array de itens selecionados
            String[] itensSelecionados = escolhaComidas.split(",");

            for (String item : itensSelecionados) {
                int itemEscolhido = Integer.parseInt(item.trim());
                switch (itemEscolhido) {
                    case 1:
                        totalComidas += 10;
                        System.out.println("Você adicionou: Pipoca Pequena (R$ 10)");
                        break;
                    case 2:
                        totalComidas += 15;
                        System.out.println("Você adicionou: Pipoca Média (R$ 15)");
                        break;
                    case 3:
                        totalComidas += 20;
                        System.out.println("Você adicionou: Pipoca Grande (R$ 20)");
                        break;
                    case 4:
                        totalComidas += 8;
                        System.out.println("Você adicionou: Refrigerante Coca Cola (R$ 8)");
                        break;
                    case 5:
                        totalComidas += 7;
                        System.out.println("Você adicionou: Refrigerante Fanta (R$ 7)");
                        break;
                    case 6:
                        totalComidas += 8;
                        System.out.println("Você adicionou: Refrigerante Guaraná (R$ 8)");
                        break;
                    case 7:
                        totalComidas += 7;
                        System.out.println("Você adicionou: Chocolate Alpino (R$ 7)");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } else {
            System.out.println("\nVocê optou por não comprar lanches.");
        }

        // Exibindo o resumo da compra
        System.out.println("\nResumo da compra:");
        System.out.println("Filme: " + filmeEscolhido);
        System.out.println("Ingressos Inteiros: " + ingressosInteiros + " x R$ " + ingressoInteiro);
        System.out.println("Ingressos Meia Entrada: " + ingressosMeiaEntrada + " x R$ " + ingressoMeia);
        System.out.println("Total de ingressos: R$ " + totalIngressos);
        System.out.println("Total de lanches: R$ " + totalComidas);

        // Total geral
        double totalGeral = totalIngressos + totalComidas;
        System.out.println("\nTotal geral a pagar: R$ " + totalGeral);

        // Confirmação de compra
        System.out.print("\nDeseja confirmar a compra? (S para confirmar, N para cancelar): ");
        String confirmacao = scanner.nextLine().toUpperCase();

        if (confirmacao.equals("S")) {
            System.out.println("\nCompra confirmada! Obrigado e aproveite o filme!");
        } else {
            System.out.println("\nCompra cancelada. Você pode reiniciar o processo.");
        }

        scanner.close();
    }
}
