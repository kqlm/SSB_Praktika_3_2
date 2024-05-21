package com.example.ssb_l3.UserEntity;

import jakarta.persistence.*;
@Entity
@Table(name = "photograf")
@NamedQuery(name = "Photsograf.getAll", query = "SELECT f from Photografs f")
public class Photografs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id_photograf;
    @Column(name = "fotoname")
    private String name;

    public Photografs(Integer id_photograf, String name) {
        this.id_photograf = id_photograf;
        this.name = name;

    }
    public Photografs() {}
    public Integer getId_photograf() {
        return id_photograf;
    }
    public void setId_photograf(Integer id_master){this.id_photograf = id_photograf;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}