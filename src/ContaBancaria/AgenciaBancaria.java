package ContaBancaria;

public class AgenciaBancaria {
    
    public boolean saque(ContaBancaria contaBancaria, double valor){
        
        double saldo = contaBancaria.getSaldo();
        if(saldo < valor){
            System.out.println("Saldo Insuficiente!");
            return false;
        }
        double novoSaldo = saldo - valor;
        System.out.println(Thread.currentThread().getName() + "Sacou R$ " + valor + " .Saldo apos o saque R$ " + novoSaldo);
        contaBancaria.setSaldo(novoSaldo);
        return true; 
    }
    
}
