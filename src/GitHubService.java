import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    // Método para obtener la información de un repositorio
    @GET("repos/{owner}/{repo}")
    Call<Repo> getRepo(@Path("owner") String owner, @Path("repo") String repo);
}

