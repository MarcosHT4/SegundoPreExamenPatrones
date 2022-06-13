package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class SalaChatIndividual implements ISalaChat{

    private List<DesarroladorSala> desarrolladores = new ArrayList<>();

    @Override
    public void send(String msg, Desarrollador desarrollador) {

        for(Desarrollador desarrolladorCompadre: desarrolladores) {

            if(desarrolladorCompadre.getIdDev().equals(desarrollador.getDesarrolladorAmigo().getIdDev())) {

                desarrolladorCompadre.received(msg);

            }

        }

    }
}
