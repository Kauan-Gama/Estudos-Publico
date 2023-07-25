package BytebankComposto;

    public class TestaContaSemCliente {
        public static void main(String[] args) {
            Conta contaDaMarcela = new Conta();
            System.out.println(contaDaMarcela.pegaSaldo());

            contaDaMarcela.titular = new Cliente();
            System.out.println(contaDaMarcela.titular);
            
            contaDaMarcela.titular.Nome = "Marcela";
            System.out.println(contaDaMarcela.titular.Nome);
        }
}