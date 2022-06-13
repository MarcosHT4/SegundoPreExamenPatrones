package ejercicio5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repositorio implements IRepositorio {

    private Map<String, Commit> almacenamientoDeCommits = new LinkedHashMap<>();

    private List<IDesarrollador> desarrolladores = new ArrayList<>();

    public void createCommit(String commitIdentifier, Commit commit) {

        almacenamientoDeCommits.put(commitIdentifier, commit);

    }

    public Commit getCommit(String commitIdentifier) {

        return almacenamientoDeCommits.get(commitIdentifier);

    }

    @Override
    public void attach(IDesarrollador desarrollador) {

        desarrolladores.add(desarrollador);

    }

    @Override
    public void dettach(IDesarrollador desarrollador) {

        desarrolladores.remove(desarrollador);

    }

    @Override

    public void dettachAll() {

        desarrolladores.clear();

    }

    @Override
    public void notifyDesarrolladores(Commit commit) {

        for(IDesarrollador desarrollador: desarrolladores) {

            desarrollador.update("Commit Recuperado!", commit);
        }

    }
}
