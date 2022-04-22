package ContaBancaria;

public class ContaBancaria {
    
    public double saldo = 0;
    
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        System.out.println("Conta Bancaria criada");
        System.out.println("Seu saldo eh: " + this.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
