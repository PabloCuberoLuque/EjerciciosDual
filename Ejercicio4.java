package EjerciciosFundamentosJava;

public class Ejercicio4 {
    public void mostrarNumeros(String palabra){
        for(int i=1;i<palabra.length();i++){
            if(palabra.charAt(i)== 0 ||palabra.charAt(i)== 1 || palabra.charAt(i)== 2 || palabra.charAt(i)== 3) {
                System.out.println(palabra.charAt(i));
            }
        }
        System.out.println("La palabra no contiene numeros.");
        }

    public static void main(String[] args) {
        Ejercicio4 palabra= new Ejercicio4();
        palabra.mostrarNumeros("P3BL0");


    }

}
