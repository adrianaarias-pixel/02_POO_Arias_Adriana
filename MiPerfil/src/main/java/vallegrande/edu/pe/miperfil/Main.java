package vallegrande.edu.pe.miperfil;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.miperfil.controller.PerfilController;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        PerfilView view = new PerfilView();
        PerfilController controller = new PerfilController(view);

        Scene scene = new Scene(view.getContenedor(), 350, 400);
        primaryStage.setTitle("Mi perfil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}