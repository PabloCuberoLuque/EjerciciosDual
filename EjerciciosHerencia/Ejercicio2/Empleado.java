package EjerciciosHerencia.Ejercicio2;

public class Empleado {
    private String nombreApellido;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombreApellido, String cedula, int edad, boolean casado, double salario) {
        this.nombreApellido = nombreApellido;
        this.cedula = cedula;
        if(edad>18 && edad<45){
            this.edad = edad;
        }
        else{
            System.out.println("Introduzca una edad comprendida entre 18 y 45.");
        }

        this.casado = casado;
        this.salario = salario;
    }

    public String clasificacion(Empleado e1){
        String resultado="Senior";
        if(e1.getEdad()<=21){
            resultado="Principiante";
        }else if (e1.getEdad()>=22 && e1.getEdad()<=35){
            resultado="Intermedio";
        }
        return resultado;

    }

    public void aumentoSalario(Empleado e1,int porcentaje){
        double aumento=(e1.getSalario()*porcentaje)/100;
        e1.setSalario(getSalario()+aumento);

    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return getNombreApellido()+"\n"+getEdad()+"\n"+getCedula()+"\n"+isCasado()+"\n"+getSalario();
    }
}
