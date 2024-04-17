package com.example.tabelafipe.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fipe")
public class FipeEntity {
    @Id
    private String id;
    private String nome;

    public String getCodigo() {
        return id;
    }

    public void setCodigo(String codigo) {
        this.id = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
