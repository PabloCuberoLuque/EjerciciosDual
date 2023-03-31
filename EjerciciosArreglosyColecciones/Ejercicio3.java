package EjerciciosArreglosyColecciones;


import java.util.Arrays;

public class Ejercicio3 {
    public static int[] valoresCentrales(int[] numeros) throws Exception {
        if(numeros.length%2 !=0){
            throw new Exception();
        }
        int mitadArray=numeros.length/2;
        int numeroCentral1=numeros[mitadArray];
        int numeroCentral2= numeros[mitadArray-1];

        int[] resultado={numeroCentral2,numeroCentral1};

        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros={6,2,3,5,6,7};
        int[] numeros1={1,2,3,4,5};
        try{
            System.out.println(Arrays.toString(Ejercicio3.valoresCentrales(numeros)));
            System.out.println(Arrays.toString(Ejercicio3.valoresCentrales(numeros1)));
        }catch (Exception e){
            System.out.println("La longitud del array debe de ser par");
        }
    }
}
