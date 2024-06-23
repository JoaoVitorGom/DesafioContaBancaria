public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        
        System.out.println("Extrato conta Corrente");
        super.imprimirInfos();
    }

    @Override
    public void investir(double valor, InterfaceConta tipoInvestimento, EnumInvestimento tipo) {
        saldo=saldo-saldo*taxaOperacaoCC;
        if(valor>0 && valor<=saldo){
            this.sacar(valor);
            tipoInvestimento.depositar(valor);
        }
        else{
            System.out.println("O valor a sacar deve ser maior que zero e menor ou igual ao saldo");
        }
    }

    @Override
    public void sacar(double valor) {
        saldo=saldo-saldo*taxaOperacaoCC;
        if(valor<=saldo){
            saldo-=valor;
        }
        else{
            System.out.println("O valor do saque deve ser menor ou igual ao saldo");
        }  
    }

    @Override
    public void tranferir(double valor, InterfaceConta contaDestino) {
        saldo=saldo-saldo*taxaOperacaoCC;
        if(valor>0 && valor<=saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        else{
            System.out.println("O valor a sacar deve ser maior que zero e menor ou igual ao saldo");
        }
    }


    

}
