package EjerciciosHerencia.Ejercicio1;

import java.util.Date;

public class Producto{
    private Date fechaCaducidad;
    private int lote;

    public Producto(Date fechaCaducidad, int lote) {
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
}
