import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);

	        System.out.println("Bem vindo ao Banco BZL");

	        ContaBanco pedro = new ContaBanco();

	        System.out.println("Digite sua agência por favor");
	        String agencia = teclado.next();
	        pedro.setAgencia(agencia);

	        System.out.println("Digite seu número por favor");
	        int numero = teclado.nextInt();
	        pedro.setNumero(numero);

	        System.out.println("Digite seu Nome por favor");
	        String nome = teclado.next();
	        pedro.setNomeCliente(nome);

	        System.out.println("Digite seu Saldo por favor");
	        double saldo = teclado.nextDouble();
	        pedro.setSaldo(saldo);

	        System.out.println("Olá " + pedro.getNomeCliente() + ", sua agência é " + pedro.getAgencia() + ", conta "
	                + pedro.getNumero() + ", e seu saldo de R$ " + pedro.getSaldo() + " está disponível para saque.");

	        teclado.close(); // fechando o scanner após o uso
	    }
		
		
		
		
	}

}
