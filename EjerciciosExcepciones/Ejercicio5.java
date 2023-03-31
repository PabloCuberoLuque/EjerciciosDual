package EjerciciosExcepciones;

public class Ejercicio5 {
    public static void main(String[] args) {
        f();
    }

    public static void g() throws ExceptionP {
        throw new ExceptionP("ExcepcionP");
    }

    public static void a() throws ExceptionN{
        throw new ExceptionN("ExcepcionN");
    }
    public static void f(){
        try{
            g();
        }catch (ExceptionP e){
            try {
                a();
            }catch (ExceptionN a){
                System.out.println("Hola");
            }}}
}
