package BytebankEncapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int Numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        total++;
        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.Numero = numero;
        System.out.println("Estou criando uma conta" + this.Numero);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
    return this.saldo;
    }
    public int getNumero() {
        return this.Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    } 
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}