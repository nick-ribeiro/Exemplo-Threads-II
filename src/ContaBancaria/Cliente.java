package ContaBancaria;

public class Cliente extends Thread{
    
    private static AgenciaBancaria agencia = new AgenciaBancaria();
    private ContaBancaria conta = null;
    private double saldo = 100;
    
    public Cliente(String nome, ContaBancaria conta){
        super(nome);
        this.conta = conta;
    }
    
    public void run() {
        try{
            
            double total = 0;
            while(this.agencia.saque(conta, saldo)) {
                total += saldo;
            }
            System.out.println(getName() + " sacou o valor R$ " + total);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
