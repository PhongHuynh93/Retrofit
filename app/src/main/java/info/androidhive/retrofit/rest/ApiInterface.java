package info.androidhive.retrofit.rest;

import info.androidhive.retrofit.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    /*
    TODO: 7/2/16 8 trang api sẽ trả về có dạng sau: http://api.themoviedb.org/3/movie/top_rated?api_key=INSERT_YOUR_API_KEY
    -> từ BASE_URL ta phải thêm path nữa movie/top_rated (trước ?) => gọi là endpoint
    The endpoints are defined inside of an interface using special retrofit annotations to encode details about the parameters and request method.
     In addition, the return value is always a parameterized Call<T> object such as Call<MovieResponse>.

    Each endpoint specifies an annotation of the HTTP method (GET, POST, etc.) and the parameters of this method can also have special annotations (@Query, @Path, @Body etc.)
    Take a look to other annotations:

@Path – variable substitution for the API endpoint. For example movie id will be swapped for{id} in the URL endpoint.

@Query – specifies the query key name with the value of the annotated parameter.

@Body – payload for the POST call

@Header – specifies the header with the value of the annotated parameter

     */
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey); // do sau dấu ? là key:value dạng này

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
