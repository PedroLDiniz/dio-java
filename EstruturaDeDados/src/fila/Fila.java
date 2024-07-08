
package fila;

public class Fila {

    private No novoNo;

    public Fila() {
        this.novoNo = null;
    }

   
    public void enqueue(No novoNo) {
        if (this.novoNo == null) {
           
            this.novoNo = novoNo;
        } else {
          
            No ultimoNo = this.novoNo;
            while (ultimoNo.getNovoNo() != null) {
                ultimoNo = ultimoNo.getNovoNo();
            }
            ultimoNo.setNovoNo(novoNo);
        }
    }


    public No first() {
        if (!this.isEmpty()) {
            return this.novoNo; 
        }
        return null;
    }


    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = this.novoNo; 
            this.novoNo = this.novoNo.getNovoNo(); 
            return primeiroNo; 
        }
        return null;
    }

   
    public boolean isEmpty() {
        return this.novoNo == null;
    }


    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No noAuxiliar = this.novoNo;

        if (this.novoNo != null) {
            while (noAuxiliar != null) {
                stringRetorno.append("[No{objeto = ").append(noAuxiliar.getObject()).append("}]--->");
                noAuxiliar = noAuxiliar.getNovoNo();
            }
            stringRetorno.append("null"); 
        } else {
            stringRetorno.append("null");
        }

        return stringRetorno.toString();
    }
}
