package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //employee info

        //types num int
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //types num real
        float salario = 11_445.44F;
        double vendasAcumulads = 2_992_797_103.01;

        //bool types
        boolean estaDeFerias = false; //true

        //Character types
        char status = 'A'; //active

        //working days
        System.out.println(anosDeEmpresa * 365);

        //Number of trips
        System.out.println(numeroDeVoos / 2);

        //points for dol
        System.out.println(pontosAcumulados / vendasAcumulads);

        System.out.println(id + " id: Earns -> " + salario );
        System.out.println("Vacation ? " + estaDeFerias);
        System.out.println("Status : " + status);
    }

}
