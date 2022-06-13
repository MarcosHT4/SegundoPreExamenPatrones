package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

    private String ci;
    private String nombre;

    private List<PersonaChat> remitentesDeseados = new ArrayList<>();
    protected ICanalWhatsapp iCanalWhatsapp;



    public Persona(ICanalWhatsapp canalWhatsapp) {

        iCanalWhatsapp = canalWhatsapp;

    }

    public Persona addRemitentesDeseados(PersonaChat persona) {

        remitentesDeseados.add(persona);
        return this;

    }



    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public List<PersonaChat> getRemitentesDeseados() {
        return remitentesDeseados;
    }

    public Persona setRemitentesDeseados(List<PersonaChat> remitentesDeseados) {
        this.remitentesDeseados = remitentesDeseados;
        return this;
    }

    public ICanalWhatsapp getiCanalWhatsapp() {
        return iCanalWhatsapp;
    }

    public void setiCanalWhatsapp(ICanalWhatsapp iCanalWhatsapp) {
        this.iCanalWhatsapp = iCanalWhatsapp;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);








}
