package ejercicio4;

public class PersonaChat extends Persona{


    public PersonaChat(ICanalWhatsapp canalWhatsapp) {
        super( canalWhatsapp);
    }

    @Override
    public void send(String msg) {

        iCanalWhatsapp.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("INFO> Persona: " + getNombre() + ", CI: " + getCi() + " recibe: " + msg);

    }
}
