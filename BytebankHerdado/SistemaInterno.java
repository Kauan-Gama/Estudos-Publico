package BytebankHerdado;

public class SistemaInterno {
    
    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
        System.out.println("Permissão de Entrada: Concedida.");
        } else {
            System.out.println("Seu Acesso ao Sistema foi NEGADO.");
        }
    }

}
