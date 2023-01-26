package com.iesam.nissansl.domain.usercase;

import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Chasis;

public class ModificarChasis {
    private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();
    public void execute(Chasis chasis){
        dataStore.modificar(chasis);
    }
}