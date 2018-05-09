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

    @GetMapping("/")
    public List<Anggota> cariSemuaData() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anggota> findById(@PathVariable("id") Integer kode) {
        Anggota anggota = repo.findOne(kode);
        if (anggota != null) return new ResponseEntity<>(anggota, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/")
    public ResponseEntity<Anggota> save(@RequestBody Anggota anggota) {
        anggota = repo.save(anggota);
        return new ResponseEntity<>(anggota, HttpStatus.CREATED);
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
