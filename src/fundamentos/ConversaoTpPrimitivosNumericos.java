package fundamentos;

import javax.swing.*;

public class ConversaoTpPrimitivosNumericos {

    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = 1.0f;
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);


        Integer num1 = 1000;
        System.out.println(num1.toString());


        int num2 = 1000;
        System.out.println(Integer.toString(num2));

        System.out.println(("" + num2));


        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(valor1 + valor2);


        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        System.out.println("soma é " + soma);
        System.out.println("Média é " + soma/2 );



    }
}
