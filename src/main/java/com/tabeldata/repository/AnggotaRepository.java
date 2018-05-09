package com.tabeldata.repository;

import com.tabeldata.entity.Anggota;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AnggotaRepository extends PagingAndSortingRepository<Anggota, Integer> {

    public List<Anggota> findAll();

    List<Anggota> findByNamaLike(String nama);
}
