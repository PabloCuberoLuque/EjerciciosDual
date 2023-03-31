package EjerciciosExcepciones;

import EjerciciosHerencia.Ejercicio2.Empleado;
public class Ejercicio4 {
    public static void main(String[] args) {
        try{
            Empleado a= null;
            a.clasificacion(a);
        }catch(NullPointerException e){
            Empleado a=new Empleado();
            a.setEdad(22);
            System.out.println(a.clasificacion(a));
        }


    }
}
