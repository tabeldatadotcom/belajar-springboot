package com.tabeldata.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AngotaApi {

    @GetMapping(value = "/api/info")
    public Map info() {
        Map<String, Object> param = new HashMap<>();
        param.put("nama", "Dimas Maryanto");
        param.put("tanggal", new Date());

        return param;
    }
}
