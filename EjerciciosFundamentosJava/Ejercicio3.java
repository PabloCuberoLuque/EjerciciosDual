package EjerciciosFundamentosJava;

public class Ejercicio3 {
    static int contador=0;

    public Ejercicio3(){
        contador++;
    }

    public static String vecesInstanciada(){
        return "Esta clase ha sido instanciada: "+contador + " veces";

    }

    public static void main(String[] args) {
        Ejercicio3 a= new Ejercicio3();
        Ejercicio3 b= new Ejercicio3();
        Ejercicio3 c= new Ejercicio3();
        Ejercicio3 d= new Ejercicio3();
        Ejercicio3 e= new Ejercicio3();
        System.out.println(Ejercicio3.vecesInstanciada());
    }
}
