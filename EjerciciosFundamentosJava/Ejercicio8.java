package EjerciciosFundamentosJava;

public class Ejercicio8 {
    public int veintiuno(int a){
        int resultado;
        if(a>21){
            resultado=a-21;
        }
        else{
            resultado=(21-a)*2;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Ejercicio8 a= new Ejercicio8();
        System.out.println(a.veintiuno(22));
    }

}
