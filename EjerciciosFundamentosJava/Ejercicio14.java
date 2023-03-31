package EjerciciosFundamentosJava;

public class Ejercicio14 {
    public boolean palindrono(String frase){
        boolean resultado;
        String fraseInvertida="";
        char a;
        for(int i=frase.length()-1;i>=0;i--){
            a=frase.charAt(i);
            fraseInvertida += a;
        }
        if(fraseInvertida.replaceAll(" ","").equalsIgnoreCase(frase.replaceAll(" ",""))){
            resultado=true;
        }
        else {
            resultado=false;
        }
        System.out.println(fraseInvertida);
        return resultado;
    }


    public static void main(String[] args) {
        Ejercicio14 a = new Ejercicio14();
        System.out.println(a.palindrono("Anita lava la tina"));

    }


}
