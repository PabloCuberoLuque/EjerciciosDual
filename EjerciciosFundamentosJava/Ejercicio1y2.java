package EjerciciosFundamentosJava;

public class Ejercicio1y2 {
    public String nombre(){
        String nombre= "Pablo";
        return "Hola, mi nombre es "+nombre;

    }

    public String nombre(String nombre){
        return "Hola, mi nombre es "+ nombre;

    }


    public static void main(String[] args) {
        Ejercicio1y2 hola =new Ejercicio1y2();
        System.out.println(hola.nombre());
        System.out.println(hola.nombre("Maria"));
    }
}

