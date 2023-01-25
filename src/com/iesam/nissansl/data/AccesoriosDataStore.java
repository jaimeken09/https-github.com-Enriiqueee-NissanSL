package com.iesam.nissansl.data;

import com.iesam.nissansl.domain.models.Accesorios;
import java.util.Map;
import java.util.TreeMap;

public class AccesoriosDataStore {

    private static AccesoriosDataStore accesoriosDataStore = null;

    private Map<Integer, Accesorios> dataStore = new TreeMap<Integer, Accesorios>();

    public void guardar(Accesorios accesorios) {
        dataStore.put(Accesorios.getCodigo(), accesorios);
    }

    public void eliminar(Integer getCod) {
        dataStore.remove(getCod);
    }

    public Accesorios buscar(Integer getCod) {
        return dataStore.get(getCod);
    }

    public void modificaraAccesorios (Accesorios accesorios) {
        dataStore.put(Accesorios.getCodigo(), accesorios);
    }

    public static AccesoriosDataStore getAccesoriosDataStore() {
        if (accesoriosDataStore == null) {
            accesoriosDataStore = new AccesoriosDataStore();
        }
        return accesoriosDataStore;
    }
}