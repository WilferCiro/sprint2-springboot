package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		Finca finca1 = new Finca(" la cecilia", "+573111111");
		Finca finca2 = new Finca(" la cecilia", "+573111111");

		Sensor sensor1 = new Sensor(15, finca1);
		Sensor sensor2 = new Sensor(20, finca1);

		Sensor sensor3 = new Sensor(3, finca2);

		MovimientoSensor mov1 = new MovimientoSensor(sensor1, 20);

		System.out.println(sensor1.getPresicion());
		System.out.println(sensor1.getFinca().getNombre());
	}

}
