package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class CanalWhatsappComunicacionGrupal implements ICanalWhatsapp {

    private List<PersonaChat> personaChats = new ArrayList<>();

    public CanalWhatsappComunicacionGrupal addPersonaChat(PersonaChat personaChat) {

        personaChats.add(personaChat);
        return this;

    }


    @Override
    public void send(String msg, Persona persona) {


        PersonaChat personaChat = (PersonaChat) persona;

        for(PersonaChat personaChatColega : personaChats) {

            for(PersonaChat personaChatRemitentes : personaChat.getRemitentesDeseados()) {

                if (!personaChat.getCi().equals(personaChatColega.getCi())) {


                    if (personaChatColega.getCi().equals(personaChatRemitentes.getCi())) {

                        personaChatColega.received(msg);

                    }
                }

            }

        }


    }
}
