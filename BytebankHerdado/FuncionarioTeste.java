package BytebankHerdado;

public class FuncionarioTeste {
    private String nome;
    private String  cpf;
    private double salario;
    private int tipo = 0; //0 - Funcionário Comum | 1 - Gerente | 2 - Diretor


    public double getBonificacao() {

        if(this.tipo == 0){//0 - Funcionário Comum
            return this.salario * 0.1;
        } else if(this.tipo == 1) {//1 - Gerente
            return this.salario;
        } else { // 2- Diretor
            return this.salario + 1000;
        }
    }
    
    //Getters e Setters
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }
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
