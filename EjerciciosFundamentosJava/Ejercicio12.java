package EjerciciosFundamentosJava;

public class Ejercicio12 {

    public boolean iniciaPrograma(String palabra){
        boolean resultado;
        String p="programa";
        if(palabra.toLowerCase().startsWith(p)){
            resultado=true;
        }
        else{
            resultado=false;
        }
        return resultado;

    }

    public static void main(String[] args) {
        Ejercicio12 p= new Ejercicio12();
        System.out.println(p.iniciaPrograma("ProgramaPablo"));
    }
}
