package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class CanalWhatsappComunicacionIndividual implements ICanalWhatsapp {


    List<PersonaChat> personaChats = new ArrayList<>();

    public CanalWhatsappComunicacionIndividual addPersonaChat(PersonaChat personaChat) {

        personaChats.add(personaChat);
        return this;

    }

    @Override
    public void send(String msg, Persona persona) {

        PersonaChat personaChat = (PersonaChat) persona;

        if(personaChat.getRemitentesDeseados().size() == 1) {

            for (Persona personaColega : personaChats) {

                if (personaColega.getCi().equals(personaChat.getRemitentesDeseados().get(0).getCi())) {

                    personaColega.received(msg);

                }

            }

        } else {

            System.out.println("ERRROR FATAL! CAMBIE AL MODO DE GRUPOS ESPECIFICOS");

        }




    }
}
