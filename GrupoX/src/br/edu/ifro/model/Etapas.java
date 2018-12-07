/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gabriel Abrão
 */
public class Etapas {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String primeira;    
    private String segunda;
    private String terceira;    
    private String quarta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimeira() {
        return primeira;
    }

    public void setPrimeira(String primeira) {
        this.primeira = primeira;
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }

    public String getTerceira() {
        return terceira;
    }

    public void setTerceira(String terceira) {
        this.terceira = terceira;
    }

    public String getQuarta() {
        return quarta;
    }

    public void setQuarta(String quarta) {
        this.quarta = quarta;
    }
}
