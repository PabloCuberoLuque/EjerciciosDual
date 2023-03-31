package EjerciciosFundamentosJava;

public class Ejercicio5{
    public String parImpar(String p1){
        String paroImpar;
        int suma=0;
        for(int i=1;i<=p1.length();i++){
            suma++;
        }
        if(suma % 2 ==0){
            paroImpar="es par";
      }
        else{
            paroImpar="es impar";
      }
        return "La palabra: "+ p1 + " " + paroImpar;


    }

    public static void main(String[] args) {
        Ejercicio5 a= new Ejercicio5();
        System.out.println( a.parImpar("Pablo"));
    }



}
