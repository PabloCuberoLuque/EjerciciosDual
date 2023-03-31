package EjerciciosObjetosMetodosVariablesyConstructores;

public class Cliente {
    private String nombre;
    private String dNI;
    private String correo;
    private int nTelefono;
    private int dinero;

    public Cliente(String nombre, String dNI, String correo, int nTelefono, int dinero) {
        this.nombre = nombre;
        this.dNI = dNI;
        this.correo = correo;
        this.nTelefono = nTelefono;
        this.dinero = dinero;
    }

    public int meterDinero(int cantidad){
        return this.dinero=dinero+cantidad;
    }

    public int sacarDinero(int cantidad){
        return this.dinero=dinero-cantidad;
    }

    @Override
    public String toString(){
        return "El nombre del cliente es: "+ getNombre()+ ", el DNI: " + getdNI() + ", el correo: "+ getCorreo() + ", el telefono: " + getnTelefono() + "y el dinero es: " + getDinero();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }


}
