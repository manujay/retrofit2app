package com.restapp.jayman.retrofit2app.Controller;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jayman on 1/11/2017.
 */

public interface WSController {

    String BASE_URL = "http://api.bizzgain.com/";
    String API_ENDPOINT = "api";
    String EMPLOYEE = "employee";

    @GET("{api}/{path}")
    Call<WSModel> getEmployee(@Path("api") String api, @Path("path") String path);
}
