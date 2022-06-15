module com.saejava.s201 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.junit.jupiter.api;
    requires java.logging;

    opens com.saejava.s201 to javafx.fxml;
    exports com.saejava.s201;
}