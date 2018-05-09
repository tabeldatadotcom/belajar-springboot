package com.tabeldata.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AnggotaApi {

    @GetMapping(value = "/api/info")
    public Map info(@RequestParam(required = false) String data) {
        Map<String, Object> param = new HashMap<>();
        param.put("nama", data);
        param.put("tanggal", new Date());
        param.put("method", "get");
        return param;
    }

    @PostMapping(value = "/api/info")
    public Map set(
            @RequestParam(required = false) String data,
            @RequestBody String value) {
        Map<String, Object> params = new HashMap<>();
        params.put("namaQueryParam", data);
        params.put("namaRequestBody", value);
        params.put("tanggal", new Date());
        params.put("method", "post");
        return params;
    }
}
