package fila;

public class No {
	
	private Object object;
	private No novoNo;
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getNovoNo() {
		return novoNo;
	}

	public void setNovoNo(No novoNo) {
		this.novoNo = novoNo;
	}

	public No () {
		
	}
	
	public No(Object object) {
		this.novoNo = null;
		this.object = object;
		
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
	
	 	

}
