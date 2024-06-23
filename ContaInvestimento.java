public class ContaInvestimento extends Conta {
    
public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void sacar(double valor) {
        saldo=saldo-saldo*taxaOperacaoIn;
        if(valor<=saldo){
            saldo-=valor;
        }
        else{
            System.out.println("O valor do saque deve ser menor ou igual ao saldo");
        }  
    }

    @Override
    public void tranferir(double valor, InterfaceConta contaDestino) {
        saldo=saldo-saldo*taxaOperacaoIn;
        if(valor>0 && valor<=saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        else{
            System.out.println("O valor a sacar deve ser maior que zero e menor ou igual ao saldo");
        }
    }

    @Override
    public void extrato() {
        
        System.out.println("Extrato conta Investimento");
        super.imprimirInfos();
    }

}
