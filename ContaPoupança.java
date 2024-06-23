/**
 * ContaPoupança
 */
public class ContaPoupança extends Conta {
    
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        
        System.out.println("Extrato conta Poupança");
        super.imprimirInfos();
    }

    
}