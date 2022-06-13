package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class SalaChatIndividual implements ISalaChat{

    private List<DesarrolladorSala> desarrolladores = new ArrayList<>();

    public SalaChatIndividual addDesarrolador(DesarrolladorSala desarroladorSala) {

        desarrolladores.add(desarroladorSala);
        return this;

    }


    @Override
    public void send(String msg, Desarrollador desarrollador) {

        DesarrolladorSala desarroladorSala = (DesarrolladorSala) desarrollador;

        for(Desarrollador desarrolladorCompadre: desarrolladores) {

            if(desarrolladorCompadre.getIdDev().equals(desarroladorSala.getDesarrolladorAmigo().getIdDev())) {

                desarrolladorCompadre.received(msg);

            }

        }

    }
}
