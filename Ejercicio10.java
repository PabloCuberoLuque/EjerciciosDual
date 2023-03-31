package EjerciciosFundamentosJava;

public class Ejercicio10 {

    public boolean diferencia(int n){
        boolean resultado;
        if(100-n<=10 || 200-n<=10){
            resultado=true;
        }
        else{
            resultado=false;
        }
        return resultado;
    }


    public static void main(String[] args) {
        Ejercicio10 a = new Ejercicio10();
        System.out.println( a.diferencia(92));
   }
}
