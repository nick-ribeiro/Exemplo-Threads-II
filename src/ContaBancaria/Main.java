package ContaBancaria;

public class Main {
    
    public static void main(String[] args) {
        
        final ContaBancaria conta = new ContaBancaria (100000);
        
        Cliente pai = new Cliente("Pai", conta);
        Cliente mae = new Cliente("Mae", conta);
        Cliente filho = new Cliente("Filho", conta);
        
        pai.start();
        mae.start();
        filho.start();
    }
}
