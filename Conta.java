public abstract class Conta implements InterfaceConta {
    
    protected int agencia;
    protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
    protected double taxaOperacaoCC = 0.005;
    protected double taxaOperacaoIn = 0.009;

	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}

    @Override
    public void depositar(double valor) {
        if(valor>0){
            saldo+=valor;
        }
        else{
            System.out.println("O valor do depósito deve ser positivo");
        }
        
    }

    @Override
    public void investir(double valor, InterfaceConta tipoInvestimento,EnumInvestimento tipo ) {
        if (tipo == EnumInvestimento.ACOES) {
            saldo -= 50;
        } else if (tipo == EnumInvestimento.RENDA_FIXA) {
            saldo -= 30;
        } else if (tipo == EnumInvestimento.CDB) {
            saldo -= 20;
        } else if (tipo == EnumInvestimento.FUNDO_IMOBILIARIO) {
            saldo -= 40;
        }
        else{
            System.out.println("opção de investimento inválida");
            saldo=0;
        }
        saldo=saldo-saldo*taxaOperacaoIn;
        if(valor>0 && valor<=saldo){
        this.depositar(valor);
    }
    else{
        System.out.println("O valor a sacar deve ser maior que zero e menor ou igual ao saldo");
    }
        
    }

    @Override
    public void sacar(double valor) {
        if(valor<=saldo){
        saldo-=valor;
    }
    else{
        System.out.println("O valor do saque deve ser menor ou igual ao saldo");
    }    
    }

    @Override
    public void tranferir(double valor, InterfaceConta contaDestino) {
        if(valor>0 && valor<=saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        else{
            System.out.println("O valor a sacar deve ser maior que zero e menor ou igual ao saldo");
        }

    }
    
    



	public double getSaldo() {
		return saldo;
	}
    public void imprimirInfos(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.cliente.getAgencia()));
		System.out.println(String.format("Numero: %d", this.cliente.getNumeroConta()));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
    
}
