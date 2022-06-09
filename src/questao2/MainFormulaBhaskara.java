package questao2;

/*2. Fórmula de Bhaskara (Vale 2 pontos)
        Considere a fórmula de bhaskara (a seguir) para encontrar os valores
        de x numa equação de 2o grau onde ax2+bx+c=0, faça um programa
        que receba um valor de a, um valor de b e um valor de c e imprima os
        valores x’ e x”.*/

import java.util.Scanner;

public class MainFormulaBhaskara {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        if (a != 0) {
            double delta = (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Essa equação não possui raízes. (Delta < 0)");
            }else if (delta == 0) {
                System.out.println("Só possui uma raíz.");
            }else{
                double x1 = ((-b + (Math.sqrt(delta)))) / (2 * a);
                double x2 = ((-b - (Math.sqrt(delta)))) / (2 * a);

                System.out.printf("x' = %.2f e x'' = %.2f", x1, x2);
            }
        } else {
            System.out.println("Não é uma equação de 2° grau!");
        }

    }


}
