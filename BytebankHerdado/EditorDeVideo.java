package BytebankHerdado;

public class EditorDeVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do EDITOR");
        return 150;
    }

}