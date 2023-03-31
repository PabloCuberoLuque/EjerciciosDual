package EjerciciosHerencia.Ejercicio1;

import java.util.Date;

public class PCongelado extends Producto{
    private double temperaturaCongelacionRecomendada;

    public PCongelado(Date fechaCaducidad, int lote, double temperaturaCongelacionRecomendada) {
        super(fechaCaducidad, lote);
        this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
    }

    public double getTemperaturaCongelacionRecomendada() {
        return temperaturaCongelacionRecomendada;
    }

    public void setTemperaturaCongelacionRecomendada(double temperaturaCongelacionRecomendada) {
        this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
    }
}
