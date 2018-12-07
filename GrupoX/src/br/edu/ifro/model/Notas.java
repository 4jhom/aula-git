/*
 * To change this licese header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Notas {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String notas; 

    @ManyToOne
    private Aluno aluno;
    @ManyToOne
    private Etapas etapas;
    @ManyToOne
    private Disciplinas disciplinas;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Etapas getEtapas() {
        return etapas;
    }

    public void setEtapas(Etapas etapas) {
        this.etapas = etapas;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }
           
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String valor) {
        this.notas = valor;
    }
}
