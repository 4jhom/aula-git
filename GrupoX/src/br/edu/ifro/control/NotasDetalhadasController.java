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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
        // TODO
    }    

    @FXML
    private void fechar(ActionEvent event) {
    }

    @FXML
    private void salvar(ActionEvent event) {
    }
    
}
