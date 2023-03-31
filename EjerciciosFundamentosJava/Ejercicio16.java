package EjerciciosFundamentosJava;

public class Ejercicio16 {
    public void rombo(){
        int filas=5;
        for(int i=1;i<=filas;i++){
            for(int espacios=1;espacios<=filas;espacios++){
                System.out.println(" ");
            }
            for(int dibujo=1;dibujo<=(2*i)-1;dibujo++){
                System.out.println("+");
            }
            System.out.println("");

        }
        filas--;

        for(int a=1;a<=filas;a++){
            for(int espacios=1;espacios<=a;espacios++){
                System.out.println(" ");
            }
            for (int dibujo=1;dibujo<=(filas-a)*2-1;dibujo++){
                System.out.println("+");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        Ejercicio16 a= new Ejercicio16();
        a.rombo();

    }
}
