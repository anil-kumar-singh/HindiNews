package com.javaques.hindinews;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Anil on 20-Nov-15.
 */
public class FeedDownloader {
    OkHttpClient client = new OkHttpClient();

    InputStream run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().byteStream();
    }
}
