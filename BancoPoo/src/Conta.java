
public abstract class Conta {

    protected Cliente cliente;
    protected long numeroConta;
    protected double saldo;

    public Conta(Cliente cliente, long numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public boolean sacar(double valor) throws SaldoInsuficiente {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Operação realizada com sucesso!");
            return true;
        } else {
            throw new SaldoInsuficiente("Saldo insuficiente para realizar a operação.");
        }
    }

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("Você acabou de Depositar: R$ " + valor);
            return true;
        } else {
            System.out.println("Valor inválido para depósito.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        try {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } catch (SaldoInsuficiente e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}