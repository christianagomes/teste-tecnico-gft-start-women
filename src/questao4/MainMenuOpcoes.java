package questao4;

import java.util.Scanner;

public class MainMenuOpcoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "";
        do{
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Calcular média aritmética");
            System.out.println("2 - Calcular média ponderada");
            System.out.println("3 - Sair");

            opcao = scanner.next();

            switch (opcao){
                case "1":
                    Media mediaAritmetica = new Media();
                    System.out.print("Digite a nota 1: ");
                    float nota1 = scanner.nextFloat();
                    System.out.print("Digite a nota 2: ");
                    float nota2 = scanner.nextFloat();
                    System.out.println("A média aritmética é: " + mediaAritmetica.calcularMediaAritmetica(nota1, nota2));
                    break;
                case "2":
                    Media mediaPonderada = new Media();
                    System.out.print("Digite a nota 1: ");
                    float notap1 = scanner.nextFloat();
                    System.out.print("Digite o peso da nota 1: ");
                    int peso1 = scanner.nextInt();
                    System.out.print("Digite a nota 2: ");
                    float notap2 = scanner.nextFloat();
                    System.out.print("Digite o peso da nota 2: ");
                    int peso2 = scanner.nextInt();
                    System.out.print("Digite a nota 3: ");
                    float notap3 = scanner.nextFloat();
                    System.out.print("Digite o peso da nota 3: ");
                    int peso3 = scanner.nextInt();
                    System.out.println("A média ponderada é: " + mediaPonderada.calcularMediaPonderada(notap1, peso1, notap2, peso2, notap3, peso3));
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while (true);


    }
}
