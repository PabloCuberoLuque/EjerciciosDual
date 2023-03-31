package EjerciciosArreglosyColecciones;

import java.util.Arrays;
import java.util.List;

public class Ejercicio62 {
    public static boolean contiene2o3(List<Integer> numeros){
        boolean resultado=true;
        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i)==2  || numeros.get(i)==3){
                resultado=false;
            }
        }
        return resultado;

    }









    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(6,2,3,5,6,7);
        List<Integer> numeros1= Arrays.asList(6,5,7,5,6,7);

        System.out.println( Ejercicio62.contiene2o3(numeros));
        System.out.println( Ejercicio62.contiene2o3(numeros1));
    }

}
