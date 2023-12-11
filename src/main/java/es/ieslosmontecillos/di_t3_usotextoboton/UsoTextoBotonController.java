package es.ieslosmontecillos.di_t3_usotextoboton;
import es.ieslosmontecillos.componentes_gonzalezadrian.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class UsoTextoBotonController implements Initializable {

    @javafx.fxml.FXML
    private CampoTextoBoton ctb1;
    @javafx.fxml.FXML
    private CampoTextoBoton ctb2;
    @javafx.fxml.FXML
    private Label lbltext;

   public void initialize(URL location, ResourceBundle resource)
   {
       ctb1.setBtnText("Grabar");
       ctb1.setOnAction(e -> {
           lbltext.setText("Se ha grabado : " +ctb1.getText());
       });

       ctb2.setBtnText("Grabar");
       ctb2.setOnAction(e -> {
           lbltext.setText("Se ha grabado : " +ctb2.getText());
       });
   }
}