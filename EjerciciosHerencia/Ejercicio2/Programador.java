package EjerciciosHerencia.Ejercicio2;

public class Programador extends Empleado{
    private int lineasCodigoPorHora;
    private String lenguajeDominante;


    public Programador(){

    }

    public Programador(String nombreApellido, String cedula, int edad, boolean casado, double salario, int lineasCodigoPorHora, String lenguajeDominante) {
        super(nombreApellido, cedula, edad, casado, salario);
        this.lineasCodigoPorHora=lineasCodigoPorHora;
        this.lenguajeDominante=lenguajeDominante;
    }

    public int getLineasCodigoPorHora() {
        return lineasCodigoPorHora;
    }

    public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
        this.lineasCodigoPorHora = lineasCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
}
