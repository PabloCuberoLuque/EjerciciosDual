package EjerciciosExcepciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        try{
            throw new Exception("Hola");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Estuve aqui");
        }
    }

}
