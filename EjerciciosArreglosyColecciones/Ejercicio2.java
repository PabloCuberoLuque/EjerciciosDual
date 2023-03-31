package EjerciciosArreglosyColecciones;

public class Ejercicio2 {
    public static boolean contiene2o3(int[] numeros){
        boolean resultado=true;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==2  || numeros[i]==3){
                resultado=false;
            }
        }
        return resultado;

    }









    public static void main(String[] args) {
        int[] numeros={6,2,3,5,6,7};
        int[] numeros1={6,5,7,5,6,7};

        System.out.println( Ejercicio2.contiene2o3(numeros));
        System.out.println( Ejercicio2.contiene2o3(numeros1));
    }
}
