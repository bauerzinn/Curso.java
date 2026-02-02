package fundamentos;

public class StringType {

    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));


        String s = " Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println();

        var nome = "Pedro";
        var sobrenome = "Henrique";
        var idade = 24;
        var salario = 2000.50;

        System.out.println("Nome: " + nome + " " + sobrenome + " \nidade: " + idade + "\nsalario:  " + salario + "\n \n");

        System.out.printf("Nome: %s %s \nIdade: %d \nsalario %.2f", nome, sobrenome, idade,  salario);





    }
}  