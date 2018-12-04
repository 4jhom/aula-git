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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    @FXML
    private Button btnSalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
