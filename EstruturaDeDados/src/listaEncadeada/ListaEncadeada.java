package listaEncadeada;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if (referenciaAux != null) {
				tamanhoLista ++;
				if(referenciaAux.getNovoNo() !=null) {
					referenciaAux = referenciaAux.getNovoNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}

		return tamanhoLista;
	}

}
