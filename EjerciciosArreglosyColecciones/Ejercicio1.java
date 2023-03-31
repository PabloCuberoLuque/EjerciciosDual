package EjerciciosArreglosyColecciones;

public class Ejercicio1 {
    public static boolean empieza6(int[] numeros){
        boolean resultado=false;
        if(numeros[0]==6 || numeros[numeros.length-1]==6){
            resultado=true;
        }
        return resultado;
    }








    public static void main(String[] args) {
        int[] numeros={6,2,3,5,6,7};
        int[] numeros1={4,2,3,5,6,7};
        int[] numeros2={4,2,3,5,6,6};

        System.out.println(Ejercicio1.empieza6(numeros));
        System.out.println(Ejercicio1.empieza6(numeros1));
        System.out.println(Ejercicio1.empieza6(numeros2));

    }



}
