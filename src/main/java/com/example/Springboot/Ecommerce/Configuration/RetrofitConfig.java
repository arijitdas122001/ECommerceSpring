package com.example.Springboot.Ecommerce.Configuration;

import com.example.Springboot.Ecommerce.gateway.Api.GetAllCategoriesApi;
import com.example.Springboot.Ecommerce.gateway.Api.GetProductByIdApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Bean
      public  Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public GetAllCategoriesApi getAllCategoriesApi(Retrofit retrofit){
        return retrofit.create(GetAllCategoriesApi.class);
    }

    @Bean
    public GetProductByIdApi getProductByIdApi(Retrofit retrofit){
        return retrofit.create(GetProductByIdApi.class);
    }
}
