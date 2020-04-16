package com.elevenst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductRemoteServiceImpl implements ProductRemoteService {

    public static final String URL = "http://localhost:8082/products/";

    @Autowired
    private RestTemplate restTemplate; //1. 빈으로 정의한 것을 DI로 받아서

    @Override
    public String getProductInfo(String productId) {
        //2. 여기서 호출
        return restTemplate.getForObject(URL + productId, String.class); //리턴되는 타입을 전달함.
    }
}
