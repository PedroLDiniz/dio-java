public class ContaCorrente extends Conta {

    private double saldoInvestimento;

    public ContaCorrente(Cliente cliente, long numeroConta) {
        super(cliente, numeroConta);
        this.saldoInvestimento = 0.0;
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    // Método específico para aplicar taxa de manutenção mensal
    public void aplicarTaxaManutencaoMensal() {
        double taxa = 10.0; // Exemplo de taxa fixa mensal
        double saldoAtual = this.consultarSaldo();

        if (saldoAtual > 0) {
            try {
				this.sacar(taxa);
			} catch (SaldoInsuficiente e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Taxa de manutenção mensal de R$ " + taxa + " aplicada com sucesso.");
        } else {
            System.out.println("Não há saldo suficiente para aplicar a taxa de manutenção mensal.");
        }
    }
}