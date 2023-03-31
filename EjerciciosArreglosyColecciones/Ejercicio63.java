package EjerciciosArreglosyColecciones;

import java.util.Arrays;
import java.util.List;

public class Ejercicio63 {
        public static List<Integer> valoresCentrales(List<Integer> numeros) throws Exception {
            if(numeros.size()%2 !=0){
                throw new Exception();
            }
            int mitadArray=numeros.size()/2;
            int numeroCentral1=numeros.get(mitadArray);
            int numeroCentral2= numeros.get(mitadArray-1);

            List<Integer> resultado= Arrays.asList(numeroCentral2,numeroCentral1);
            return resultado;
        }

        public static void main(String[] args) {
            List<Integer> numeros= Arrays.asList(6,2,3,5,6,7);
            List<Integer> numeros1= Arrays.asList(1,2,3,4,5);
            try{
                System.out.println((EjerciciosArreglosyColecciones.Ejercicio63.valoresCentrales(numeros)));
                System.out.println(EjerciciosArreglosyColecciones.Ejercicio63.valoresCentrales(numeros1));
            }catch (Exception e){
                System.out.println("La longitud del array debe de ser par");
            }
        }

}
