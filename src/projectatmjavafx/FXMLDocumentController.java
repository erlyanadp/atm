/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SuperJeje
 */
public class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;

    @FXML
    private Label label;
    @FXML
    private JFXPasswordField editPin;
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton buttonC;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonOK;

    

    @FXML
    void tekan1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin += "2";
        editPin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin += "3";
        editPin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin += "4";
        editPin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin += "5";
        editPin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin += "6";
        editPin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin += "7";
        editPin.setText(pin);
    }

    @FXML
    void tekanC(ActionEvent event) {
        pin += "";
        editPin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin += "8";
        editPin.setText(pin);
    }

    @FXML
    void tekan0(ActionEvent event) {
        pin += "0";
        editPin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin += "9";
        editPin.setText(pin);
    }

    @FXML
    private void tekanOK(ActionEvent event) {
        if (pin.equals(PIN)){
            try{
                //Hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
                //Load the new fxml
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLTampilanAwal.fxml"));
                Scene scene = new Scene (fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Pilih Uang yang akan Anda Tarik");
                stage.show();
            }
            catch (IOException e){
                System.out.println("Failed to create Window." + e);
            }
            } else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan +  " kesempatan lagi!");
            editPin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}