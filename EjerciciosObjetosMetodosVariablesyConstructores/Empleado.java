package EjerciciosObjetosMetodosVariablesyConstructores;

public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }



    @Override
    public String toString(){
        return "El nombre es: "+ getNombre() + ",el puesto es: " + getPuesto() +"y su salario es: " + getSalario();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
