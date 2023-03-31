package EjerciciosFundamentosJava;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio19 {
    public boolean validarIBAN(String IBAN){
        boolean resultado=false;
        //Pasando caracteres al final
        String caracteresFinales=IBAN.substring(0,3);
        IBAN=IBAN.substring(3,24);
        String nuevoIBAN=IBAN+caracteresFinales;
        BigInteger c= new BigInteger(IBAN);

        //Cambiando letras por numeros
        Map<String,Integer> letra = new HashMap<>();
        letra.put("A",10);
        letra.put("B",11);
        letra.put("C",12);
        letra.put("D",13);
        letra.put("E",14);
        letra.put("F",15);
        letra.put("G",16);
        letra.put("H",17);
        letra.put("I",18);
        letra.put("J",19);
        letra.put("K",20);
        letra.put("L",21);
        letra.put("M",22);
        letra.put("N",23);
        letra.put("O",24);
        letra.put("P",25);
        letra.put("Q",26);
        letra.put("R",27);
        letra.put("S",28);
        letra.put("T",29);
        letra.put("U",30);
        letra.put("V",31);
        letra.put("W",32);
        letra.put("X",33);
        letra.put("Y",34);
        letra.put("Z",35);

        int c1= letra.get(caracteresFinales.substring(0,1));
        int c2=letra.get(caracteresFinales.substring(1,2));

        String iBANFinals= String.valueOf(c)+c1+c2;
        BigInteger iBANFinal= new BigInteger(iBANFinals);
        BigInteger moduloIban= iBANFinal.divide(BigInteger.valueOf(97));
        BigInteger diferenciaResto=moduloIban.subtract(BigInteger.valueOf(98));











        return resultado;
    }

    public static void main(String[] args) {
        Ejercicio19 iban  =  new Ejercicio19();
        iban.validarIBAN("ES0000120345030000067890");
    }
}