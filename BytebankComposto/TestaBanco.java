package BytebankComposto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente Paulo = new Cliente();
        Paulo.Nome = "Paulo Silveira";
        Paulo.CPF = "222.222.222-22";
        Paulo.Profissao = "programador";
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = Paulo;
        System.out.println(contaDoPaulo.titular.Nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(Paulo);
    }
    
}
