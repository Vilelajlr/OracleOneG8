public class Conta {

    private String name;
    private String accountType;
    private double openingBalance;

    public Conta(){}

    public Conta(String name, String accountType, double openingBalance){
        this.setName(name);
        this.setAccountType(accountType);
        depositar(openingBalance);
    }

    public void consultarSaldo(){
        System.out.println("\n\nO saldo da conta e de: " + getOpeningBalance() + "\n\n");
    }

    public void depositar(double valor){
        if(valor > 0){
            openingBalance += valor;
            consultarSaldo();
        } else {
            System.out.println("\nDigite um valor maior do que zero!\n\n");
        }
    }

    public void saque(double valor){
        if(valor > openingBalance){
            System.out.println("Saldo insuficiente para saque!");
        } else if (valor > 0) {
            openingBalance -= valor;
            consultarSaldo();
        } else {
            System.out.println("\nDigite um valor maior do que zero!\n\n");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    @Override
    public String toString() {
        return "********************************************\n" +
                "Dados iniciais do cliente\n\n\n" +
                "nome: \t\t\t" + name  +
                "\nTipo conta: \t" + accountType  +
                "\nSaldo inicial:\t" + openingBalance +
                "\n******************************************\n\n\n\n";
    }
}
