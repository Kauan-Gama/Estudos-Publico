package BytebankHerdadoConta;

public class CalculaImposto {

    public double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImpoto(){
        return totalImposto;
    }
}
