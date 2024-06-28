
public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cliente cliente1 = new Cliente();
	        cliente1.setNome("João Silva");
	        cliente1.setEndereco("Rua das Flores, 123");
	        cliente1.setNumeroConta(1001);
	        cliente1.setDataNasc("01/01/1980");

	        Cliente cliente2 = new Cliente();
	        cliente2.setNome("Maria Souza");
	        cliente2.setEndereco("Avenida Principal, 456");
	        cliente2.setNumeroConta(2001);
	        cliente2.setDataNasc("15/06/1990");

	        // Criando contas corrente e poupança para os clientes
	        ContaCorrente contaCorrenteJoao = new ContaCorrente(cliente1, 1001);
	        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(cliente2, 2001);

	        // Exibindo informações iniciais das contas
	        System.out.println("--- Informações Iniciais ---");
	        exibirInformacoes(contaCorrenteJoao);
	        exibirInformacoes(contaPoupancaMaria);

	        // Realizando operações nas contas
	        System.out.println("\n--- Realizando Operações ---");

	        // Depositar na conta corrente de João
	        contaCorrenteJoao.depositar(500);
	        consultarSaldo(contaCorrenteJoao);

	        // Tentar sacar mais do que o saldo da conta poupança de Maria (deve falhar)
	        try {
	            contaPoupancaMaria.sacar(1500);
	        } catch (SaldoInsuficiente e) {
	            System.out.println(e.getMessage());
	        }

	        // Transferir dinheiro da conta corrente de João para a conta poupança de Maria
	        contaCorrenteJoao.transferir(contaPoupancaMaria, 200);

	        // Aplicar taxa de manutenção mensal na conta corrente de João
	        contaCorrenteJoao.aplicarTaxaManutencaoMensal();

	        // Calcular rendimento mensal na conta poupança de Maria
	        contaPoupancaMaria.calcularRendimentoMensal();

	        // Exibindo saldo após operações
	        System.out.println("\n--- Saldo Atual ---");
	        consultarSaldo(contaCorrenteJoao);
	        consultarSaldo(contaPoupancaMaria);
	    }

	    // Método auxiliar para exibir informações da conta
	    public static void exibirInformacoes(Conta conta) {
	        Cliente cliente = conta.cliente;
	        System.out.println("Cliente: " + cliente.getNome());
	        System.out.println("Número da Conta: " + cliente.getNumeroConta());
	        System.out.println("Endereço: " + cliente.getEndereco());
	        System.out.println("Data de Nascimento: " + cliente.getDataNasc());
	        System.out.println("Saldo: R$ " + conta.consultarSaldo());
	        System.out.println("Tipo de Conta: " + conta.getClass().getSimpleName());
	        System.out.println();
	    }

	    // Método auxiliar para consultar saldo da conta
	    public static void consultarSaldo(Conta conta) {
	        Cliente cliente = conta.cliente;
	        System.out.println("Saldo da Conta de " + cliente.getNome() + ": R$ " + conta.consultarSaldo());
	    }
	}

