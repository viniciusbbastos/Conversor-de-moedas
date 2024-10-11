import br.com.alura.conversordemoedas.modelos.Registro;
import br.com.alura.conversordemoedas.modelos.MoedasExchageRate;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/37a0a7e3b3ccef59a3295fe7/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                //.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject cambio = jsonObject.getAsJsonObject("conversion_rates");

        MoedasExchageRate moedasExchageRate = gson.fromJson(cambio, MoedasExchageRate.class);
        Registro moeda = new Registro(moedasExchageRate);
        System.out.println(moeda.getDolar());
    }
}
