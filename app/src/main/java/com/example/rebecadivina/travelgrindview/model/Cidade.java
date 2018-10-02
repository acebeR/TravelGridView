package com.example.rebecadivina.travelgrindview.model;

import java.io.Serializable;

public class Cidade implements Serializable{

    private String nome;
    private String descricao;
    private int img;

    public Cidade(String nome, String descricao, int img) {
        this.nome = nome;
        this.descricao = descricao;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
