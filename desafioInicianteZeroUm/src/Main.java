import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta acc1;

        String name = "Jose Leandro";
        String accountType = "Corrente";
        double openingBalance = 2000.00;

        acc1 = new Conta(name, accountType, openingBalance);
        System.out.println(acc1);
        System.out.println("Operacoes\n\n\n");



        int control = 0;
        double valores = 0.0;


        do{

            String optionsMenu = """
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - sair
                    """;
            System.out.println(optionsMenu);
            System.out.print("-> ");
            control = sc.nextInt();

            switch (control) {
                case 1: acc1.consultarSaldo();
                    break;
                case 2:
                    do {
                        System.out.println("\n\nDigite um valor para deposito.");
                        System.out.print("->");
                        valores = sc.nextDouble();
                        acc1.depositar(valores);

                    } while (valores <= 0);
                    valores = 0.0;
                    break;
                case 3:
                    do {
                        System.out.println("\n\nDigite um valor para saque.");
                        System.out.print("->");
                        valores = sc.nextDouble();
                        acc1.saque(valores);

                    } while (valores <= 0);
                    valores = 0.0;
                    break;
                case 4:
                    break;

            }

        }while (control != 4);


    }
}
