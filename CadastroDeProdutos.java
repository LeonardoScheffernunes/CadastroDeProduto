package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Exibir produtos cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Cadastrar produto
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    produtos.add(new Produto(nome, preco, quantidade));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    // Exibir produtos cadastrados
                    System.out.println("Produtos cadastrados:");
                    for (Produto produto : produtos) {
                        System.out.printf("Nome: %s, Preço: %.2f, Quantidade: %d%n", 
                                          produto.getNome(), 
                                          produto.getPreco(), 
                                          produto.getQuantidade());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
