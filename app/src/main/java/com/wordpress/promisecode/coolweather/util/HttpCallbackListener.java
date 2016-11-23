package com.wordpress.promisecode.coolweather.util;

/**
 * Created by tuyit on 2016/11/23.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
