public interface InterfaceConta{

 public void sacar (double valor);

 public void depositar(double valor);

 public void tranferir(double valor, InterfaceConta contaDestino);

 public void extrato();

 public void investir(double valor, InterfaceConta tipoInvestimento,EnumInvestimento tipo);

 public void tipoInvestimento(double valor, EnumInvestimento tipo);

}