/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 79643035204
 */
public class NotasController implements Initializable {

    @FXML
    private ComboBox<?> cbNotas;
    @FXML
    private TextField Nota;
    @FXML
    private ComboBox<?> cbEtapa;
    @FXML
    private ComboBox<?> cbDisciplina;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
