package com.tabeldata.controller;

import com.tabeldata.entity.Anggota;
import com.tabeldata.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anggota")
public class AnggotaApi {

    @Autowired
    private AnggotaRepository repo;

    @GetMapping("/list")
    public List<Anggota> cariSemuaData() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Anggota findById(@PathVariable("id") Integer kode) {
        return repo.findOne(kode);
    }

    @PostMapping("/")
    public Anggota save(@RequestBody Anggota anggota) {
        return repo.save(anggota);
    }

    @PutMapping("/")
    public Anggota update(@RequestBody Anggota anggota) {
        return repo.save(anggota);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Anggota> delete(@PathVariable("id") Integer id) {
        repo.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
