public class Serivio {
    private int codigoPedido;
    private String descripcion;
    private boolean estado;

    public Serivio(int codigoPedido, String descripcion) {
        this.codigoPedido = codigoPedido;
        this.descripcion = descripcion;
        this.estado = false;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String resultado=  "Codigo=" + codigoPedido + " \n Descripcion=" + descripcion ;
        return estado? resultado +"\nOrden finalizada": resultado +"\nProcesando Orden";
    }


}
