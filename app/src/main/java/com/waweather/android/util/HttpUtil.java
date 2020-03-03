package com.waweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xuhongchun on 2020/2/18.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
