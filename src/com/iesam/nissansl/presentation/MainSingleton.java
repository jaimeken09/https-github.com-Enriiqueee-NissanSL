package com.iesam.nissansl.presentation;

import com.iesam.nissansl.data.DataStoreSingleton;

public class MainSingleton {

    public void main(){

        DataStoreSingleton dataStoreSingleton1 = DataStoreSingleton.getDataStoreSingleton();
        DataStoreSingleton dataStoreSingleton2 = DataStoreSingleton.getDataStoreSingleton();
        DataStoreSingleton dataStoreSingleton3 = DataStoreSingleton.getDataStoreSingleton();
        DataStoreSingleton dataStoreSingleton4 = DataStoreSingleton.getDataStoreSingleton();
    }

}
