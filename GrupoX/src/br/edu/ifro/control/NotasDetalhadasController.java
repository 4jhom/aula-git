/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Aluno;
import br.edu.ifro.model.Disciplinas;
import br.edu.ifro.model.Etapas;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class NotasDetalhadasController implements Initializable {

    @FXML
    private ComboBox<Aluno> cbAluno;
    @FXML
    private TextField txtNotas;
    @FXML
    private ComboBox<Etapas> cbEtapa;
    @FXML
    private ComboBox<Disciplinas> cbDisciplina;

    /**
     * Initializes the controller class.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        
        
        Query query = em.createQuery("SELECT a FROM Aluno a");
        List aluno = query.getResultList();
        cbAluno.setItems(FXCollections.observableArrayList(aluno));
        
         Query query1 = em.createQuery("SELECT a FROM Etapas a");
        List Etapas = query1.getResultList();
        cbEtapa.setItems(FXCollections.observableArrayList(Etapas));
        
        
         Query query2 = em.createQuery("SELECT a FROM Disciplinas a");
        List Disciplina = query.getResultList();
        cbDisciplina.setItems(FXCollections.observableArrayList(Disciplina));
    
    } 
    @FXML
    private void fechar(ActionEvent event) {
    }

    @FXML
    private void salvar(ActionEvent event) {
    }
    
}
