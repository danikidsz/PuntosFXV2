/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.puntosfxv2;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import modelo.Puntos2D;


/**
 * FXML Controller class
 *
 * @author kevin.aristizabal
 */
public class FXMLPuntosController implements Initializable {
    
    LinkedList<Puntos2D>listaP;
    
    @FXML
    public Label idLabel1;
    
    @FXML
    public Canvas idCanvas;
    
    @FXML
    public TextArea txtA;
    
    @FXML
    public Button idMostrar;
    
    @FXML
     public Button btnGuardar;
    
   
    
    GraphicsContext g;
    
     
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listaP = new LinkedList<>();
        g = idCanvas.getGraphicsContext2D();
        double h =idCanvas.getHeight();
        double w = idCanvas.getWidth();
        
        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);
        
    }    
    
    @FXML
    public void getCoordenadas(MouseEvent m){
        
        double x = m.getX();
        double y = m.getY();
        System.out.println("X: "+x+","+"Y: "+y);
        listaP.add(new Puntos2D(x, y));
    }
    
    @FXML
     private void mostrar (ActionEvent a){
         
         String mostrar = "";
         for (int i = 0; i < listaP.size(); i++) {
            Puntos2D get = listaP.get(i);
            mostrar+=get.toString() + "\n";
            
        }
         txtA.setText(mostrar);
         
        
     }
     @FXML
     private void accionGuardar(ActionEvent a){
         FileChooser fileChooser = new FileChooser();
         
     }
  

}
