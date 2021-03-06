/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Aluno;
import br.edu.ifro.model.Disciplinas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class DisciplinasController implements Initializable {

    @FXML
    private TextField txtDisciplinas;
    
    private Disciplinas disciplinas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     private void salvar(ActionEvent event) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Disciplinas disciplinas1;
        if (disciplinas != null) {            
            Query query = em.createQuery("SELECT a FROM Disciplinas as a WHERE a.id = :id");
            query.setParameter("id", disciplinas.getId());

            disciplinas1 = (Disciplinas) query.getSingleResult();
        } 
        else {
            disciplinas1 = new Disciplinas();
        }     
        
        disciplinas1.setNome(txtDisciplinas.getText());
        
        
         em.getTransaction().begin();
        
        em.persist(disciplinas1);
        
        em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
         Stage stage = (Stage) txtDisciplinas.getScene().getWindow();
        stage.close();
    }


}

