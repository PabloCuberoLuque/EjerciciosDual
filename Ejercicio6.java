package EjerciciosFundamentosJava;

public class Ejercicio6 {
    public String tipoTriangulo(float lado1, float lado2 , float lado3){
        String resultado="";
        if((lado1!=lado2 && lado2!=lado3) || (lado1!=lado3 && lado2!=lado3)){
            resultado="El triangulo es escaleno.";
        }
        if((lado1==lado2 && lado2!=lado3) || (lado1!=lado2 && lado2==lado3)){
            resultado="El triangulo es isosceles.";
        }
        if(lado1==lado2 && lado2==lado3){
            resultado="El triangulo es equilatero.";
        }
        return resultado;
    }


    public static void main(String[] args) {
        Ejercicio6 a= new Ejercicio6();
        System.out.println(a.tipoTriangulo(10.6f,1.6f,10.6f));

    }
}
