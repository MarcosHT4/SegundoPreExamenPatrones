package ejercicio3;

public class Celular {

    private String modelo;
    private String marca;
    private String gamma;
    private int precio;

    public Celular(String modelo, String marca, String gamma, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gamma = gamma;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo() {

        System.out.println("Celular: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Gamma: " + gamma);
        System.out.println("Precio: " + precio);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
    }

}
