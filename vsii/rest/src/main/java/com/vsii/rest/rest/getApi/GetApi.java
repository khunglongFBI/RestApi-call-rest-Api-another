package com.vsii.rest.rest.getApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vsii.rest.rest.dto.AccountDTO;
import com.vsii.rest.rest.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GetApi {
    @Autowired
    AccountServiceImpl accountService;
    @Autowired
    ObjectMapper mapper;

        @RequestMapping(value = "/account",method = RequestMethod.GET)
    public List<AccountDTO> getAccount() {
    List<AccountDTO> accountDTOList= accountService.findAll();
     return accountDTOList;
}}
   /* ResponseEntity<List<Account>> responseEntity = restTemplate.exchange("http://192.168.0.77:8080/api/account", HttpMethod.GET, null, new ParameterizedTypeReference<List<Account>>() {
    });
    List<Account> accountList = responseEntity.getBody();
            for (Account a : accountList) {
                    log.info(a.toString());
                    }*/