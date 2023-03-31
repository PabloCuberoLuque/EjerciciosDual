package EjerciciosArreglosyColecciones;

import java.util.Arrays;

public class Ejercicio5 {
    public static String[] cadenaNumeros(String[] palabras){
        String[] resultado= new String[palabras.length];
        int posicion=0;
        for (String palabra:palabras){
            for(int i=0;i<palabra.length();i++){
                if(Character.isDigit(palabra.charAt(i))){
                    resultado[posicion]= palabra;
                    posicion++;
                    break;
                }

            }
        }
        return resultado;
    }


    public static void main(String[] args) {
        String[] palabras={"Hola","H0la","1234","Pablo","134P"};

        System.out.println(Arrays.toString(Ejercicio5.cadenaNumeros(palabras)));
    }

}
