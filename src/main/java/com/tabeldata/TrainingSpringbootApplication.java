package com.tabeldata;

import com.tabeldata.entity.Anggota;
import com.tabeldata.repository.AnggotaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class TrainingSpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext springContext = SpringApplication.run(TrainingSpringbootApplication.class, args);
        AnggotaRepository repo = springContext.getBean(AnggotaRepository.class);
        Anggota a = new Anggota();
        a.setNama("Muhamad");
        a.setAlamat("bandung");
        a.setTanggalLahir(Date.valueOf("1991-03-20"));
        repo.save(a);


        List<Anggota> list = repo.findByNamaLike("%M%");
        System.out.println("jumlah data : " + list.size());
        for (Anggota anggota : list) {
            System.out.println(anggota.toString());
        }
//        a.setKode(1);
    }
}
