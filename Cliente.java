public class Cliente {
    
 private String nome;
 private int agencia;
 private int numeroConta;



public Cliente(String nome, int agencia, int numeroConta) {
    this.nome = nome;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
}
public Cliente(Cliente joao, int i, int i2, Object object) {
    //TODO Auto-generated constructor stub
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getAgencia() {
    return agencia++;
}
public void setAgencia(int agencia) {
    this.agencia = agencia;
}
public int getNumeroConta() {
    return numeroConta++;
}
public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
}


}