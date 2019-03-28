package com.vsii.rest.rest.service;

import com.vsii.rest.rest.dto.AccountDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl  {

    static final String URL_ACCOUNT = "http://localhost:8080/api/account";
    public List<AccountDTO> findAll() {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<List<AccountDTO>> responseEntity = restTemplate.exchange(URL_ACCOUNT, HttpMethod.GET,null,new ParameterizedTypeReference<List<AccountDTO>>() {
        });
        List<AccountDTO> accountList = responseEntity.getBody();
        return accountList;
    }
}
