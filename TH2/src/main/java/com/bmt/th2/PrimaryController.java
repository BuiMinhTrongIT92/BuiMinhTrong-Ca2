package com.bmt.th2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Label lbl;
    
    public void bmi(ActionEvent event){
        double height = Double.parseDouble(this.txtHeight.getText());
        double weight = Double.parseDouble(this.txtWeight.getText());
        double bmii = weight / Math.pow(height, 2);
//        this.lbl.setText(Double.toString(bmii));
//        thaydoimauchu
        this.lbl.setTextFill(Color.DARKBLUE);
        if(bmii <18.5)
            this.lbl.setText("Gay");
        else if (bmii <25)
        {
            this.lbl.setText("Binh thuong");
        }else {
            this.lbl.setText("Beo");
        }
        
//        else if(bmii <25)
//            this.lbl.setText("Binh thuong");
//        else
//            this.lbl.setTextFill(Color.RED);
//            this.lbl.setText("Beo");
            
    }
   
}
