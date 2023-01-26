package com.iesam.nissansl.data;

import java.util.Map;
import java.util.TreeMap;
import com.iesam.nissansl.domain.models.Accesorios;


public class AccesoriosDataStore {

    private static AccesoriosDataStore accesoriosDataStore = null;

    private Map<Integer, Accesorios> dataStore = new TreeMap<Integer, Accesorios>();

    public void guarda(Accesorios accesorios) {
        dataStore.put(accesorios.getCod(), accesorios);
    }

    public void eliminar(Accesorios accesorios) {
        dataStore.put(accesorios.getCod(), accesorios);
    }


    public void modificaraccesorios (Accesorios accesorios) {
        dataStore.put(accesorios.getCod(), accesorios);
    }

    public static AccesoriosDataStore getAccesoriosDataStore() {
        if (accesoriosDataStore == null) {
            accesoriosDataStore = new AccesoriosDataStore();
        }
        return accesoriosDataStore;
    }
}