package com.example.ssb_l3.UserEntity;

import jakarta.persistence.*;
@Entity
@Table(name = "client")
@NamedQuery(name = "Clients.getAll", query = "SELECT c from Clients c")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id_client;
    @Column(name = "name")
    private String name;


    public Clients(Integer id_client, String name) {
        this.id_client = id_client;
        this.name = name;

    }
    public Clients() {}
    public Integer getId_client() {
        return id_client;
    }
    public void setId_client(Integer id) {
        this.id_client = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}