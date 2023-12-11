module es.ieslosmontecillos.di_t3_usotextoboton {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_gonzalezadrian;


    opens es.ieslosmontecillos.di_t3_usotextoboton to javafx.fxml;
    exports es.ieslosmontecillos.di_t3_usotextoboton;
}