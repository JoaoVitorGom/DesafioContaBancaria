/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

       Cliente joao = new Cliente("joao", 1, 1);
       Cliente joao2 = new Cliente("joao", 2, 3);
       EnumInvestimento tipoInvest = EnumInvestimento.ACOES;

       Conta c1 = new ContaCorrente(joao);
       Conta c2 = new ContaInvestimento(joao2);
       Conta c3 = new ContaPoupança(joao2);

       c1.depositar(1000);
       c2.depositar(1500);
       c3.depositar(2000);
       c1.sacar(100);
       c2.sacar(222);

       c1.extrato();
       c2.extrato();
       c3.extrato();

       c2.investir(1000, c3, tipoInvest);
       c3.extrato();
       c2.extrato();

        
    }

}