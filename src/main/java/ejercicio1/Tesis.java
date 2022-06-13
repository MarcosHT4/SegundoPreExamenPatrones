package ejercicio1;

public class Tesis {

    private int idTesis;
    private String contenidoTesis;
    private String revisiones;

    public Tesis(int idTesis, String contenidoTesis, String revisiones) {

        this.idTesis = idTesis;
        this.contenidoTesis = contenidoTesis;
        this.revisiones = revisiones;

    }

    public int getIdTesis() {
        return idTesis;
    }

    public void setIdTesis(int idTesis) {
        this.idTesis = idTesis;
    }

    public String getContenidoTesis() {
        return contenidoTesis;
    }

    public void setContenidoTesis(String contenidoTesis) {
        this.contenidoTesis = contenidoTesis;
    }

    public String getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(String revisiones) {
        this.revisiones = revisiones;
    }

    public void showInfo() {

        System.out.println("ID tesis: " + idTesis);
        System.out.println("Contenido de la tesis: " + contenidoTesis);
        System.out.println("Revisiones de la version actual: " + revisiones);

    }

}
