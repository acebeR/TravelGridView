package com.example.rebecadivina.travelgrindview.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pais implements Serializable {

    private String nome;
    private int img;
    private List<Cidade> cidades = new ArrayList<>();


    public Pais(String nome, int img, List<Cidade> cidades) {
        this.nome = nome;
        this.img = img;
        this.cidades = cidades;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
}
