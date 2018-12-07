/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Etapas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class EtapasController implements Initializable {

    @FXML
    private TextField txtPrimeira;
    @FXML
    private TextField txtSegunda;
    @FXML
    private TextField txtTerceira;
    @FXML
    private TextField txtQuarta;
    private Etapas etapas;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
 @FXML
    private void salvar(ActionEvent event) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Etapas etapas1;
        if (etapas != null) {            
            Query query = em.createQuery("SELECT a FROM Etapas as a WHERE a.id = :id");
            query.setParameter("id", etapas.getId());

            etapas1 = (Etapas) query.getSingleResult();
        } 
        else {
            etapas1 = new Etapas();
        }     
        
        etapas1.setPrimeira(txtPrimeira.getText());
        
        etapas1.setSegunda(txtSegunda.getText());
        
        etapas1.setTerceira(txtTerceira.getText());
        
        etapas1.setQuarta(txtQuarta.getText());
        
         em.getTransaction().begin();
        
        em.persist(etapas1);
        
        em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
         Stage stage = (Stage) txtPrimeira.getScene().getWindow();
        stage.close();
    }
    
}
