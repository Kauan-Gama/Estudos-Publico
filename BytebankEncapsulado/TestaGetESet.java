package BytebankEncapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        
        conta.getTitular().setProfissao("programador");

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
    }
}

