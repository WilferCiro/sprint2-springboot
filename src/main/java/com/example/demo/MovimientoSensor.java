package com.example.demo;

public class MovimientoSensor {
    private Sensor sensor;
    private float valor;

    public MovimientoSensor(Sensor sensor, float valor) {
        this.sensor = sensor;
        this.valor = valor;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
