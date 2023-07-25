package BytebankHerdado;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
      g.setSenha(2222);

        Admin adm = new Admin();
        adm.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);

    }
}
