package com.tabeldata.controller;

import com.tabeldata.entity.Anggota;
import com.tabeldata.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnggotaApi {

    @Autowired
    private AnggotaRepository repo;

    @GetMapping("/api/anggota/list")
    public List<Anggota> cariSemuaData() {
        return repo.findAll();
    }
}
