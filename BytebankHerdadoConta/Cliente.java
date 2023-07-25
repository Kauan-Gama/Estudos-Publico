package BytebankHerdadoConta;

public class Cliente {
    String Nome;
    String CPF;
    String Profissao;
	
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        this.Nome = Nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getProfissao() {
        return Profissao;
    }
    public void setProfissao(String profissao) {
        this.Profissao = profissao;
    }
}