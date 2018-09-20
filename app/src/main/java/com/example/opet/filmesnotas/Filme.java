package com.example.opet.filmesnotas;

/**
 * Created by opet on 19/09/2018.
 */

public class Filme {

    private String nome;
    private int    nota;

    public Filme(){} // construtor vazio

    public Filme(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome () { return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getNota() { return nota; }

    public void setNota(int nota) {this.nota = nota;}

}
