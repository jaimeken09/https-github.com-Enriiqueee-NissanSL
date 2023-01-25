package com.iesam.nissansl.data;

public class DataStoreSingleton {
    private static DataStoreSingleton dataStoreSingleton = null;

    private DataStoreSingleton(){

    }
    public static DataStoreSingleton getDataStoreSingleton(){
        if (dataStoreSingleton == null){
            dataStoreSingleton = new DataStoreSingleton();
        }
        return dataStoreSingleton;
    }
}
