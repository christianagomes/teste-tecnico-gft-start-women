package questao1;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnagrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String entrada1 = scan.next();
        System.out.println("Digite a segunda palavra: ");
        String entrada2 = scan.next();

        char[] array1 = entrada1.toCharArray();
        char[] array2 = entrada2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)){
            System.out.println(entrada2 + " é anagrama de " + entrada1);
        }
        else{
            System.out.println(entrada2 + " não é anagrama de " + entrada1);
        }

        scan.close();
    }
}
