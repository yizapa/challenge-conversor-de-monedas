package monedas;

import java.util.Scanner;

public class ConvertirMonedas {

	public static void conversion(String monedaOrigen, String monedaDestino, BusquedaMonedas consulta,
			Scanner ingreseMoneda) {
		double valorAConvertir;
		double valorConvertido;

		Monedas monedas = consulta.buscarMoneda(monedaOrigen, monedaDestino);
		System.out.println(
				"Convierta la moneda\n1 " + monedaOrigen + " = " + monedas.conversion_rate() + " " + monedaDestino);
		System.out.println("Ingrese el valor a convertir " + monedaOrigen);
		valorAConvertir = Double.parseDouble(ingreseMoneda.nextLine());
		valorConvertido = valorAConvertir * monedas.conversion_rate();
		System.out
				.println(valorAConvertir + " " + monedaOrigen + " = " + valorConvertido + " " + monedas.target_code());
	}

	public static void conversionAMoneda(BusquedaMonedas consulta, Scanner ingreseMoneda) {
		System.out.println("Ingrese la moneda (ej: BRL) a convertir:");
		String monedaOrigen = ingreseMoneda.nextLine().toUpperCase();
		System.out.println("Ingrese la moneda (ej: UYU) destino");
		String monedaDestino = ingreseMoneda.nextLine().toUpperCase();
		conversion(monedaOrigen, monedaDestino, consulta, ingreseMoneda);
	}
}
