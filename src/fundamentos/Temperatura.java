package fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        final double fator = 5.0 / 9;
        double ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;

        System.out.println("celcius = " + celsius);

        // teste github

    }
}
