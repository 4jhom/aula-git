/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;


import br.edu.ifro.model.Aluno;
import br.edu.ifro.model.Disciplinas;
import br.edu.ifro.model.Etapas;
import br.edu.ifro.model.Notas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
public class NotasController implements Initializable {


    @FXML
    private TextField txtNotas;
    
     private Notas notas;
    @FXML
    private ComboBox<?> cbAluno;
    @FXML
    private ComboBox<?> cbEtapa;
    @FXML
    private ComboBox<?> cbDisciplina;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Notas notas1;
        if (notas != null) {            
            Query query = em.createQuery("SELECT a FROM Notas as a WHERE a.id = :id");
            query.setParameter("id", notas.getId());

            notas1 = (Notas) query.getSingleResult();
        } 
        else {
            notas1 = new Notas();
        }     
        
        notas1.setNotas(txtNotas.getText());
        
        
         em.getTransaction().begin();
        
        em.persist(notas1);
        
        em.getTransaction().commit();
    }
    
    
    
    @FXML
    private void fechar(ActionEvent event) {
         Stage stage = (Stage) txtNotas.getScene().getWindow();
        stage.close();
    }

    
}