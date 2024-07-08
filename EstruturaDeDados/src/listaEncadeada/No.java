package listaEncadeada;

public class No<T> {
	
	private T conteudo;
	private No novoNo;
	
	public No () {
		this.novoNo = null;
	}
	
	public No (T conteudo) {
		this.conteudo = conteudo;
	}
	
	public No(T conteudo, No novoNo) {
		this.conteudo = conteudo;
		this.novoNo = novoNo;
		
	}

	
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getNovoNo() {
		return novoNo;
	}

	public void setNovoNo(No novoNo) {
		this.novoNo = novoNo;
	}
	
	
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str = " \"No [conteudo=\" + conteudo + \"]\";";
		if (novoNo != null) {
			str += "->" + novoNo.toString();
		} else {
			str +="null" ;
		}
		return str;
	}
 
	
	
}
