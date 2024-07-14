module ca.canada.inspection.insilicopcr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.apache.commons.cli;
    requires java.desktop;

    opens ca.canada.inspection.insilicopcr to javafx.fxml;
    exports ca.canada.inspection.insilicopcr;
}