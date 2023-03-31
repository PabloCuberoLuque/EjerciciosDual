package EjerciciosFundamentosJava;

public class Ejercicio7 {

    public String vocales(String palabra){
        int sumaVocales=0;
        for(int i=1;i<palabra.length();i++){
            if(palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' || palabra.charAt(i)=='o' || palabra.charAt(i)=='u'){
                sumaVocales++;
            }
        }
        return "La palabra "+ palabra +" tiene "+ sumaVocales +" vocales";
    }


    public static void main(String[] args) {
        Ejercicio7 a= new Ejercicio7();
        System.out.println( a.vocales("Pablo"));
    }
}
