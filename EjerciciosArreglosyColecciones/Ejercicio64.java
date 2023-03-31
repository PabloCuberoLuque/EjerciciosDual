package EjerciciosArreglosyColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio64 {
    public static List<Integer> valoresInvertidos(List<Integer> numeros) {
        List<Integer> resultado=new ArrayList<Integer>(numeros.size());
        int a=0;
        for (int i = numeros.size()-1; i >= 0; i--) {
            resultado.add(numeros.get(i));
            a++;
        }
        return resultado;
    }


    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(1,2,3,4,5);

        try{
            System.out.println((Ejercicio64.valoresInvertidos(numeros)));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error en la longitud de la lista.");
        }


    }
}
