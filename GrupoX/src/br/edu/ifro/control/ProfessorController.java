/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class ProfessorController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnFechar;
    @FXML
    private TextField txtTelefone;
    @FXML
    private ComboBox<?> cbCidade;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}
