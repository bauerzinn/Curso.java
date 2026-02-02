package fundamentos;

import java.util.Scanner;

public class Console {

    static void main() {
        System.out.print("Bom");
        System.out.print(" dia\n");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite o sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\nNome: " + nome);
        System.out.println("\nSobrenome: " + sobrenome);
        System.out.println("\nidade: " + idade);

        entrada.close();


    }
}
