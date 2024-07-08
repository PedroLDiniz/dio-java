package fila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No(1));
		minhaFila.enqueue(new No(2));
		minhaFila.enqueue(new No(3));
		minhaFila.enqueue(new No(4));
		minhaFila.enqueue(new No(5));
		
		System.out.println(minhaFila);
		
		minhaFila.dequeue();
		minhaFila.dequeue();
		minhaFila.first();

	}

}
