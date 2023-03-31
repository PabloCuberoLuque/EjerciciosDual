package EjerciciosFundamentosJava;

public class Ejercicio13{
    public boolean edades(int e1, int e2, int e3){
        boolean resultado;
        if((e1>13 && e1<19)||(e2>13 && e2<19)||(e3>13 && e3<19)){
            resultado=true;
        }
        else{
            resultado=false;
        }
        return resultado;
    }


    public static void main(String[] args) {
        Ejercicio13 a= new Ejercicio13();
        System.out.println( a.edades(12,16,62));
    }
}
