package com.iesam.nissansl.domain.usercase;

import com.iesam.nissansl.data.AccesoriosDataStore;
import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Accesorios;
import com.iesam.nissansl.domain.models.Chasis;

public class EliminarAccesorios {
    private AccesoriosDataStore dataStore = AccesoriosDataStore.getAccesoriosDataStore();

    public void execute(Accesorios accesorios) {
        dataStore.eliminar(accesorios);
    }
}
