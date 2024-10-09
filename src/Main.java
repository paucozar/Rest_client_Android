import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Configurar Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Crear una instancia del servicio GitHub
        GitHubService service = retrofit.create(GitHubService.class);

        // Hacer la solicitud a la API (repositorio "octocat/Hello-World")
        Call<Repo> repoCall = service.getRepo("octocat", "Hello-World");

        try {
            // Ejecutar la solicitud y obtener la respuesta
            Response<Repo> response = repoCall.execute();
            if (response.isSuccessful()) {
                Repo repo = response.body();
                System.out.println("Información del repositorio:");
                System.out.println(repo);
            } else {
                System.out.println("Error en la solicitud: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

