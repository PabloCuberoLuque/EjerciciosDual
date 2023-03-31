package EjerciciosExcepciones;

public class Ejercicio7 {
    public static void excepcionA() throws ExceptionA{
        throw new ExceptionA("ExceptionA");

    }

    public static void excepcionN() throws ExceptionN{
        throw new ExceptionN("ExceptionN");

    }

    public static void excepcionP() throws ExceptionP{
        throw new ExceptionP("ExceptionP");

    }

    public static void main(String[] args) {
        try{
            Ejercicio7.excepcionA();
            Ejercicio7.excepcionN();
            Ejercicio7.excepcionP();
        }catch (ExceptionP eP){
            System.out.println("Excepcion P capturada");
        }catch (ExceptionN eN){
            System.out.println("Excepcion N capturada");
        }catch (ExceptionA eA){
            System.out.println("Excepcion A capturada");
        }
    }
}

