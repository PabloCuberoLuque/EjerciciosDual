package EjerciciosFundamentosJava;

public class Ejercicio11 {

    public String caracterFinal(String palabra){
        char caracterFinal='a';
        int i= 0;
        String resultado="";
        while(i<palabra.length()){
            caracterFinal=palabra.charAt(i);
            i++;
        }
        resultado=caracterFinal+palabra+caracterFinal;

        return resultado;

    }


    public static void main(String[] args) {
        Ejercicio11 a= new Ejercicio11();
        System.out.println(a.caracterFinal("Pablo"));
    }

}
