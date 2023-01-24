package com.iesam.nissansl.data;
 import com.iesam.nissansl.domain.models.Chasis;

 import java.util.Map;
 import java.util.TreeMap;
public class ChasisDataStore {
    private static ChasisDataStore instance = null;

    private Map<String, Chasis> dataStore = new TreeMap<>();

    public void guardar(Chasis chasis) {
        dataStore.put(chasis.getCodigo(), chasis);
    }

    public void eliminar(String chasis) {
        dataStore.remove(chasis);
    }

    public Chasis(String chasis) {
        return dataStore.get(chasis);
    }

    public void modificar(Chasis chasis) {
        dataStore.put(chasis.getCodigo(), chasis);
    }

    public static ChasisDataStore getInstance() {
        if (instance == null) {
            instance = new ChasisDataStore();
        }
        return instance;
    }
}
