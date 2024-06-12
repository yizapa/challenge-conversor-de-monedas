package monedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class BusquedaMonedas {
	public Monedas buscarMoneda(String monedaOrigen, String monedaDestino) {

		String API_KEY = "YOUR API KEY"; // Coloque su API KEY de Exchangerate aquí
		URI direccion = URI.create(
				"https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino);

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			return new Gson().fromJson(response.body(), Monedas.class);
		} catch (Exception e) {
			throw new RuntimeException("No se encuentra la moneda");
		}
	}

}
