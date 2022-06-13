package ejercicio1;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlmacenamientoTesis {

    private Map<String, VersionTesis> versionesTesis = new LinkedHashMap<>();

    public void createVersionTesis(String tesisVersionIdentifier, VersionTesis versionTesis) {

        versionesTesis.put(tesisVersionIdentifier, versionTesis);

    }

    public VersionTesis getVersionTesis(String tesisVersionIdentifier) {

        return versionesTesis.get(tesisVersionIdentifier);

    }

}
