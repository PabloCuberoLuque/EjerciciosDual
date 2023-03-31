package EjerciciosExcepciones;

public class Ejercicio9 {
    public static void main(String[] args) {
        int contador=0;
        while(contador<5){
            try{
                throw new ExceptionA("Exception a");
            } catch (ExceptionA e) {
                System.out.println("Exception a capturada");
                contador++;
            }
        }
        System.out.println("Ya ha terminado el ciclo");
    }

}
