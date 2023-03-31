package EjerciciosFundamentosJava;

public class Ejercicio9 {

    public boolean dormir(boolean diaSemana, boolean vacaciones){
        boolean resultado=false;
        if(diaSemana==true && vacaciones==false){
            resultado=false;
        } else if (diaSemana==true && vacaciones==true){
            resultado=true;
        } else if (diaSemana==false && vacaciones==true) {
            resultado=true;
        }
        return resultado;
    }


    public static void main(String[] args) {
        Ejercicio9 a= new Ejercicio9();
        System.out.println(a.dormir(true,true));
    }

}
