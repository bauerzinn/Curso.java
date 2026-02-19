package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class Dasafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite seu primeiro salário: ");
        String valor1 = entrada.next().replace(",",".");

        System.out.println("digite seu segundo salário: ");
        String valor2 = entrada.next().replace(",",".");

        System.out.println("digite seu terceiro salário: ");
        String valor3 = entrada.next().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor1);
        double salario3 = Double.parseDouble(valor1);

        double soma = (salario1 + salario2 + salario3) / 3;
        System.out.println("sua media salarial de 3 mesês é de: " + soma);

        entrada.close();



    }
}
