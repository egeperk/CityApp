package com.egeperk.cityapp;

public class Singleton  {

    private Landmarks sentLandmark;
    private static Singleton singleton;

    //// singelton.getInstance() nerde çağırırsan çağır hep aynı objeyi döndürecek

    private Singleton() {

    }

    public Landmarks getSentLandmark() {
        return sentLandmark;
    }
    public void setSentLandmark(Landmarks sentLandmark){
        this.sentLandmark = sentLandmark;
    }

    public static Singleton getInstance(){
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }



}

