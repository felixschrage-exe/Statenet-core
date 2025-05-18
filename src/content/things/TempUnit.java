package content.things;

import java.util.HashSet;

public class TempUnit {

	public static final HashSet<TempUnit> all = new HashSet<TempUnit>();

	public final String name;
	public final char symbol;
	public final char basedOnUnit;

	public static final class BaseUnits {

		public final char CELSIUS = 'C';
		public final char KELVIN = 'K';
		public final char FAHRENHEIT = 'F';

		public static float toCelsius(char unit, float value) {
			switch (unit) {
				case 'C': return value;
				case 'K': return value - 273.15f;
				case 'F': return (float) (value - 32.0f) * 5.0f / 9.0f;
				default: return Float.MIN_VALUE;
			}
		}

		public static float toKelvin(char unit, float value) {
			switch (unit) {
				case 'C': return value + 273.15f;
				case 'K': return value;
				case 'F': return (float) ((value - 32.0f) * 5.0f / 9.0f) + 273.15f;
				default: return Float.MIN_VALUE;
			}
		}

		public static float toFahrenheit(char unit, float value) {
			switch (unit) {
				case 'C': return (float) (value * 9.0f / 5.0f) + 32.0f;
				case 'K': return (float) ((value - 273.15f) * 9.0f / 5.0f) + 32.0f;
				case 'F': return value;
				default: return Float.MIN_VALUE;
			}
		}
			
	}
	
	public TempUnit(String name, char symbol, char basedOnUnit) {
		this.name = name;
		this.symbol = symbol;
		this.basedOnUnit = basedOnUnit;		
		all.add(this);
	}

	@Override
	public String toString() {
		return this.name;
	}
	 
}
