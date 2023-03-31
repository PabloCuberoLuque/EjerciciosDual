package EjerciciosArreglosyColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ejercicio65 {
    public static List<String> cadenaNumeros(List<String> palabras){
        List<String> resultado=new ArrayList<>(palabras.size());
        int posicion=0;
        for (String palabra:palabras){
            for(int i=0;i<palabra.length();i++){
                if(Character.isDigit(palabra.charAt(i))){
                    resultado.add(posicion,palabra);
                    posicion++;
                    break;
                }

            }
        }
        resultado.removeIf(Objects::isNull);
        return resultado;
    }


    public static void main(String[] args) {
        List<String> palabras=Arrays.asList("Hola","H0la","1234","Pablo","134P");
        List<String> palabras1=Arrays.asList("Hola","H0la","1234","Pablo","134P","Pablo5","1");
        System.out.println(Ejercicio65.cadenaNumeros(palabras));
        System.out.println(Ejercicio65.cadenaNumeros(palabras1));
    }

}


