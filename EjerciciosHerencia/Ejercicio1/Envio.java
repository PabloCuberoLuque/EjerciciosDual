package EjerciciosHerencia.Ejercicio1;

public class Envio {
    private PFresco[] productosFrescos;
    private PCongelado[] productosCongelados;
    private PRefrigerado[] productosRefrigerados;

    public Envio(PFresco[] productosFrescos, PCongelado[] productosCongelados, PRefrigerado[] productosRefrigerados) {
        this.productosFrescos = productosFrescos;
        this.productosCongelados = productosCongelados;
        this.productosRefrigerados = productosRefrigerados;
    }
    public PFresco[] getProductosFrescos() {
        return productosFrescos;
    }

    public void setProductosFrescos(PFresco[] productosFrescos) {
        this.productosFrescos = productosFrescos;
    }



    public PCongelado[] getProductosCongelados() {
        return productosCongelados;
    }

    public void setProductosCongelados(PCongelado[] productosCongelados) {
        this.productosCongelados = productosCongelados;
    }

    public PRefrigerado[] getProductosRefrigerados() {
        return productosRefrigerados;
    }

    public void setProductosRefrigerados(PRefrigerado[] productosRefrigerados) {
        this.productosRefrigerados = productosRefrigerados;
    }




}
