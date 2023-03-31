package EjerciciosExcepciones;

import EjerciciosHerencia.Ejercicio2.Empleado;

public class Ejercicio2 {
    public static void main(String[] args) {
        try{
            throw new ExceptionP("Excepcion Personal");
        }catch (ExceptionP e){
            System.out.println(e.imprimirMensaje());
        }

    }}
