package com.sadiqrazasyed.spreadsheetinput;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpreadsheetWebService {

    @POST("1FAIpQLSdtDkrSieZNYkU3K6EQBR2alIX4FsN5o9A5l_-KjZSPDmMjdw/formResponse")
    @FormUrlEncoded
    Call<Void> feedbackSend(
        @Field("entry.1761353828") String feedback,
        @Field("entry.432570231") String name,
        @Field("entry.1949120247") String email
    );

}
