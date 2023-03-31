package EjerciciosArreglosyColecciones;

import java.util.Arrays;

public class Ejercicio4 {
    public static int[] valoresInvertidos(int[] numeros) {
        int[] resultado=new int[numeros.length];
        int a=0;
        for (int i = numeros.length-1; i>=0; i--) {
            resultado[a]=numeros[i];
            a++;
        }
        return resultado;
    }


    public static void main(String[] args) {
        int[] numeros={1,2,3,4,5};

        try{
            System.out.println(Arrays.toString(Ejercicio4.valoresInvertidos(numeros)));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error en la longitud del array.");
        }


    }
}