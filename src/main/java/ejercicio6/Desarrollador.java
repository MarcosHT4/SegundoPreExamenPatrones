package ejercicio6;

public abstract class Desarrollador {

    private String nombre;
    private String idDev;
    private DesarrolladorSala desarrolladorAmigo;

    protected ISalaChat salaChat;

    public Desarrollador(ISalaChat salaChat) {

        this.salaChat = salaChat;

    }

    public String getNombre() {
        return nombre;
    }

    public Desarrollador setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getIdDev() {
        return idDev;
    }

    public Desarrollador setIdDev(String idDev) {
        this.idDev = idDev;
        return this;
    }

    public DesarrolladorSala getDesarrolladorAmigo() {
        return desarrolladorAmigo;
    }

    public void setDesarrolladorAmigo(DesarrolladorSala desarrolladorAmigo) {
        this.desarrolladorAmigo = desarrolladorAmigo;
    }

    public ISalaChat getSalaChat() {
        return salaChat;
    }

    public void setSalaChat(ISalaChat salaChat) {
        this.salaChat = salaChat;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);

}
