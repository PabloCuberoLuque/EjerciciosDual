package EjerciciosExcepciones;

import java.sql.SQLOutput;

public class Ejercicio6 {
    public static void main(String[] args) {
        f();
    }
    public static ExceptionP g()throws ExceptionP{
        throw new ExceptionP("ExcepcionP");
    }
    public static ExceptionN a() throws ExceptionN{
        throw new ExceptionN("ExcepcionN");
    }
    public static void f(){
        try{
            //g();
        }catch (RuntimeException e){
            System.out.println("Hola");
        }

    }
}

