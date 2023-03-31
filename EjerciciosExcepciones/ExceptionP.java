package EjerciciosExcepciones;

public class ExceptionP extends Throwable{
    public ExceptionP(String message) {
        super(message);
    }
    public String imprimirMensaje(){
        return "Error " + getMessage();
    }
}
