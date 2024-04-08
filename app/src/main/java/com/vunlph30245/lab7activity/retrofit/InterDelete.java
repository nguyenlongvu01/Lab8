package com.vunlph30245.lab7activity.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterDelete {
    @FormUrlEncoded
    @POST("delete_product.php")
    Call<SvrResponseDelete> deleteDB(@Field("pid") String pid);
}
