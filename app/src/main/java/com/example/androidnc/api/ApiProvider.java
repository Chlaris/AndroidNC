package com.example.androidnc.api;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ApiProvider {
    private static final String AndroidNC_API_ENDPOINT = "/index.php/apps/android_nc/api/";
    private static final String NC_API_ENDPOINT = "/ocs/v2.php/";
    private static Retrofit retrofit = null;
    static GsonConfig gsonConfig;

    static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl("R.string.url_server")
                .addConverterFactory(GsonConverterFactory.create(gsonConfig.getGson()))
                .client(client)
                .build();

        return retrofit;
    }
}
