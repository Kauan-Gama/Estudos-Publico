package BytebankHerdado;

//não pode instanciar dessa classe, pq é abstrato
public abstract class Funcionario {
    private String nome;
    private String  cpf;
    private double salario;

    //metodo sem corpo
    public abstract double getBonificacao();

    //Getters e Setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
