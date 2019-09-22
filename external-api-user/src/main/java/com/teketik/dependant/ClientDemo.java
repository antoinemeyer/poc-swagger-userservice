package com.teketik.dependant;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.UserApi;
import org.openapitools.client.model.User;

import java.io.IOException;

public class ClientDemo {

    final static UserApi userAPI = new ApiClient().createService(UserApi.class);

    public static void main(String[] args) throws IOException {
        final User user = userAPI.getUserById(1L).execute().body();
        System.out.println(user);
    }

}
