package EjerciciosArreglosyColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio61 {
    public static boolean empieza6(List<Integer> numeros){
        boolean resultado=false;
        if(numeros.get(0)==6 || numeros.get(numeros.size()-1)==6){
            resultado=true;
        }
        return resultado;
    }



    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(4,5,6,7,4,2,6);
        List<Integer> numeros1= Arrays.asList(4,5,6,7,4,2,4);
        List<Integer> numeros2= Arrays.asList(6,5,6,7,4,2,9);

        System.out.println(Ejercicio61.empieza6(numeros));
        System.out.println(Ejercicio61.empieza6(numeros1));
        System.out.println(Ejercicio61.empieza6(numeros2));

    }



}
