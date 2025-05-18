package main;

import content.things.*;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("TO CELSIUS");
		System.out.println(TempUnit.BaseUnits.toCelsius('C', 100));
		System.out.println(TempUnit.BaseUnits.toCelsius('K', 100));
		System.out.println(TempUnit.BaseUnits.toCelsius('F', 100));
		System.out.println(TempUnit.BaseUnits.toCelsius('H', 100));
		System.out.println("***************************");


		System.out.println("TO KELVIN");
		System.out.println(TempUnit.BaseUnits.toKelvin('C', 100));
		System.out.println(TempUnit.BaseUnits.toKelvin('K', 100));
		System.out.println(TempUnit.BaseUnits.toKelvin('F', 100));
		System.out.println(TempUnit.BaseUnits.toKelvin('H', 100));
		System.out.println("***************************");
		
		System.out.println("TO FAHRENHEIT");
		System.out.println(TempUnit.BaseUnits.toFahrenheit('C', 100));
		System.out.println(TempUnit.BaseUnits.toFahrenheit('K', 100));
		System.out.println(TempUnit.BaseUnits.toFahrenheit('F', 100));
		System.out.println(TempUnit.BaseUnits.toFahrenheit('H', 100));
		System.out.println("***************************");

	}
	
}
