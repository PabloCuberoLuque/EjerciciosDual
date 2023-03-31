package EjerciciosFundamentosJava;

import java.sql.SQLOutput;

public class Ejercicio18 {

    public boolean validarNumeroCuenta(String numeroCuenta){
        boolean resultado=false;
        //Divido el numero cuenta
        String nBanco=numeroCuenta.substring(0,4);
        String nSucursal=numeroCuenta.substring(4,8);
        String nCuenta=numeroCuenta.substring(10,20);


        //Paso el String a int y hago cuentas
        int a=Integer.parseInt(String.valueOf(((Character.getNumericValue(nBanco.charAt(0))*4)+(Character.getNumericValue(nBanco.charAt(1))*8)+(Character.getNumericValue(nBanco.charAt(2))*5)+(Character.getNumericValue((nBanco.charAt(3)))*10))));
        int b=Integer.parseInt(String.valueOf(((Character.getNumericValue(nSucursal.charAt(0))*9)+(Character.getNumericValue(nSucursal.charAt(1))*7)+(Character.getNumericValue(nSucursal.charAt(2))*3)+(Character.getNumericValue((nSucursal.charAt(3)))*6))));

        int s=a+b;
        int c=s % 11;
        int d1=11-c;
        if(d1==10){
            d1=1;
        }else if (d1==11){
            d1=0;
        }

        int d=Integer.parseInt(String.valueOf(((Character.getNumericValue(nCuenta.charAt(0))) + (Character.getNumericValue(nCuenta.charAt(1)) * 2) + (Character.getNumericValue(nCuenta.charAt(2)) * 4) + (Character.getNumericValue((nCuenta.charAt(3))) * 8) + (Character.getNumericValue(nCuenta.charAt(4)) * 5) + (Character.getNumericValue(nCuenta.charAt(5)) * 10) + (Character.getNumericValue(nCuenta.charAt(6)) * 9) + (Character.getNumericValue(nCuenta.charAt(7)) * 7) + (Character.getNumericValue(nCuenta.charAt(8)) * 3) + (Character.getNumericValue(nCuenta.charAt(9)) * 6))));
        int e=d % 11;
        int d2= 11-e;
        if(d2==10){
            d2=1;
        }else if(d2==11) {
            d2=0;
        }

        String cc=nBanco + nSucursal +  d1 + d2 + nCuenta;
        if(cc.equals(numeroCuenta)){
            resultado=true;
        }

        return resultado;

    }


    public static void main(String[] args) {
        Ejercicio18 a= new Ejercicio18();
        System.out.println(a.validarNumeroCuenta("01889322562626708753"));
    }
}
