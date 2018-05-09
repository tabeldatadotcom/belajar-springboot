package com.tabeldata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_anggota")
public class Anggota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_anggota")
    private Integer kode;

    @Column(name = "nama_anggota", nullable = false, length = 50)
    private String nama;

    @Column(name = "alamat_anggota")
    private String alamat;

    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;
}
