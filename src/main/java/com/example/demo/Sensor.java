package com.example.demo;

public class Sensor {
    private float presicion;
    private Finca finca;

    public Sensor(float presicion, Finca finca) {
        this.presicion = presicion;
        this.finca = finca;
    }

    public float getPresicion() {
        return presicion;
    }

    public void setPresicion(float presicion) {
        this.presicion = presicion;
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }
}
