package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PerfilView {
    private VBox contenedor;
    private Label titulo;
    private TextField txtNombre;
    private TextField txtCarrera;
    private TextField txtSemestre;
    private TextField txtCursoFavorito;
    private Button btnMostrar;
    private Button btnLimpiar;
    private Label lblResultado;

    public PerfilView() {
        titulo = new Label("MI PERFIL");

        txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre");

        txtCarrera = new TextField();
        txtCarrera.setPromptText("Ingrese su carrera");

        txtSemestre = new TextField();
        txtSemestre.setPromptText("Ingrese su semestre");

        txtCursoFavorito = new TextField();
        txtCursoFavorito.setPromptText("Ingrese su curso favorito");

        btnMostrar = new Button("Mostrar Perfil");
        btnLimpiar = new Button("Limpiar");

        HBox contenedorBotones = new HBox(10);
        contenedorBotones.setAlignment(Pos.CENTER);
        contenedorBotones.getChildren().addAll(btnMostrar, btnLimpiar);

        lblResultado = new Label();

        // --- ESTILOS EN TONOS ROSA ---
        String estiloCampo = "-fx-background-color: #FFFFFF; "
                + "-fx-border-color: #F48FB1; "
                + "-fx-border-radius: 8; "
                + "-fx-background-radius: 8; "
                + "-fx-padding: 8; "
                + "-fx-font-size: 13px;";

        txtNombre.setStyle(estiloCampo);
        txtCarrera.setStyle(estiloCampo);
        txtSemestre.setStyle(estiloCampo);
        txtCursoFavorito.setStyle(estiloCampo);

        titulo.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #C2185B;");

        btnMostrar.setStyle("-fx-background-color: #EC407A; "
                + "-fx-text-fill: white; "
                + "-fx-font-size: 13px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 8; "
                + "-fx-padding: 8 16; "
                + "-fx-cursor: hand;");

        btnLimpiar.setStyle("-fx-background-color: #F8BBD0; "
                + "-fx-text-fill: #880E4F; "
                + "-fx-font-size: 13px; "
                + "-fx-font-weight: bold; "
                + "-fx-background-radius: 8; "
                + "-fx-padding: 8 16; "
                + "-fx-cursor: hand;");

        lblResultado.setStyle("-fx-font-size: 13px; "
                + "-fx-text-fill: #880E4F; "
                + "-fx-font-weight: bold; "
                + "-fx-background-color: #FCE4EC; "
                + "-fx-background-radius: 8; "
                + "-fx-padding: 10; "
                + "-fx-alignment: center;");
        lblResultado.setMaxWidth(Double.MAX_VALUE);

        contenedor = new VBox(12);
        contenedor.setPadding(new Insets(25));
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setStyle("-fx-background-color: #FFF0F5;");

        contenedor.getChildren().addAll(
                titulo,
                txtNombre,
                txtCarrera,
                txtSemestre,
                txtCursoFavorito,
                contenedorBotones,
                lblResultado
        );
    }

    public VBox getContenedor() {
        return contenedor;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public TextField getTxtCarrera() {
        return txtCarrera;
    }

    public TextField getTxtSemestre() {
        return txtSemestre;
    }

    public TextField getTxtCursoFavorito() {
        return txtCursoFavorito;
    }

    public Button getBtnMostrar() {
        return btnMostrar;
    }

    public Button getBtnLimpiar() {
        return btnLimpiar;
    }

    public Label getLblResultado() {
        return lblResultado;
    }
}