package EjerciciosExcepciones;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};
        try{
            System.out.println(numeros[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            for(int i=0; i<=numeros.length-1;i++){
                System.out.println(numeros[i]);
            }
        }

    }


}
