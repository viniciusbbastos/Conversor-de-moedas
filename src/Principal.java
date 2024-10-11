import br.com.alura.conversordemoedas.calculos.Conversor;
import br.com.alura.conversordemoedas.modelos.Menu;
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
       // System.out.println(json);

        Gson gson = new GsonBuilder()
                //.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject cambio = jsonObject.getAsJsonObject("conversion_rates");

        MoedasExchageRate moedasExchageRate = gson.fromJson(cambio, MoedasExchageRate.class);
        Registro registro = new Registro(moedasExchageRate);
        Conversor conversor = new Conversor(registro);
        Menu menu = new Menu();

        String[] resposta = new String[2];
        do {
            menu.mostrarMenu();
            resposta = menu.escolha();
            if (!resposta[0].equals("exit")) {
                double valor = menu.perguntaValor();
                System.out.println(conversor.converte(resposta, valor));
            }
        } while (!resposta[0].equals("exit"));
        System.out.println("Obrigado!");
    }
}
