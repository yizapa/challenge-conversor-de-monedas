
import java.util.Scanner;
import monedas.BusquedaMonedas;
import monedas.ConvertirMonedas;

public class Principal {
	public static void main(String[] args) {
		Scanner ingreseMoneda = new Scanner(System.in);
		BusquedaMonedas consulta = new BusquedaMonedas();

		int opcion = 0;

		while (opcion != 8) {
			System.out.println("\n**************************\n" + "   CONVERSOR DE MONEDAS\n"
					+ "**************************\n" + "Ingrese opcion a convertir\n\n" + "1. ARS a USD\n"
					+ "2. USD a ARS\n" + "3. ARS a EUR\n" + "4. EUR a ARS\n" + "5. ARS a CNY\n" + "6. CNY a ARS\n"
					+ "7. Ingrese otra moneda\n" + "8. Salir");
			opcion = ingreseMoneda.nextInt();
			ingreseMoneda.nextLine();

			switch (opcion) {
			case 1:
				ConvertirMonedas.conversion("ARS", "USD", consulta, ingreseMoneda);
				break;

			case 2:
				ConvertirMonedas.conversion("USD", "ARS", consulta, ingreseMoneda);
				break;

			case 3:
				ConvertirMonedas.conversion("ARS", "EUR", consulta, ingreseMoneda);
				break;

			case 4:
				ConvertirMonedas.conversion("EUR", "ARS", consulta, ingreseMoneda);
				break;

			case 5:
				ConvertirMonedas.conversion("ARS", "CNY", consulta, ingreseMoneda);
				break;

			case 6:
				ConvertirMonedas.conversion("CNY", "ARS", consulta, ingreseMoneda);
				break;

			case 7:
				ConvertirMonedas.conversionAMoneda(consulta, ingreseMoneda);
				break;

			case 8:
				System.out.println("Gracias por utilizar nuestro servicio");
				break;

			default:
				System.out.println("Opción incorrecta, por favor ingrese una opción válida");
				break;

			}
		}

	}

}
