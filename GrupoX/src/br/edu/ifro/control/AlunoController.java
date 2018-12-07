/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;


import br.edu.ifro.model.Aluno;
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
 * @author Gabriel Abrão
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtTelefone;
    
    private Aluno aluno;

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
        
        Aluno aluno1;
        if (aluno != null) {            
            Query query = em.createQuery("SELECT a FROM Aluno as a WHERE a.id = :id");
            query.setParameter("id", aluno.getId());

            aluno1 = (Aluno) query.getSingleResult();
        } 
        else {
            aluno1 = new Aluno();
        }     
        
        aluno1.setNome(txtNome.getText());
        
        aluno1.setTelefone(txtTelefone.getText());
        
         em.getTransaction().begin();
        
        em.persist(aluno1);
        
        em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
         Stage stage = (Stage) txtNome.getScene().getWindow();
        stage.close();
    }
    
}
