package EjerciciosFundamentosJava;

public class Ejercicio17 {
    public boolean validarDNI(String dNI){
        boolean resultado;
        String[] letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String letra="";

        int numerosDNI=0;

        for(int i=0; i<dNI.length()-1;i++){
            numerosDNI=dNI.charAt(i);
        }

        int resto=numerosDNI % 23;
        letra=letras[resto];

        if(dNI.endsWith(letra) || dNI.length()==9){
            resultado=true;
        }
        else{
            resultado=false;
        }
        return resultado;

    }


    public static void main(String[] args) {
        Ejercicio17 a= new Ejercicio17();
        System.out.println(a.validarDNI("49824459L"));
    }
}
