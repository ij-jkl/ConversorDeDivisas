import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultas {
    public ApiGet consultaBusca(String currency1, String currency2) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f660db7dee3b2453c9cb00c8/pair/" + currency1 + "/" + currency2);
        // Direccion con la apikey, le paso 2 parametros la primera moneda y la segunda y devuelve conversion_rate

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(direccion)
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ApiGet.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro esa opcion de conversion.");
        }
    }
}


// f660db7dee3b2453c9cb00c8 API KEY