public class ContaPoupanca extends Conta {

    private double taxaRendimento; // Taxa de rendimento mensal em percentual (ex: 0.5 para 0.5%)

    public ContaPoupanca(Cliente cliente, long numeroConta) {
        super(cliente, numeroConta);
        this.taxaRendimento = 0.5; // Exemplo de taxa de rendimento mensal inicial
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Método específico para calcular rendimento mensal
    public void calcularRendimentoMensal() {
        double rendimento = this.consultarSaldo() * (taxaRendimento / 100); // Calcula o rendimento baseado na taxa
        this.depositar(rendimento); // Deposita o rendimento na conta
        System.out.println("Rendimento mensal de R$ " + rendimento + " aplicado com sucesso.");
    }
}