package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Resena;
import java.util.ArrayList;

public class ResenaController {

    private ArrayList<Resena> resenas;

    public ResenaController() {
        resenas = new ArrayList<>();
    }

    public void agregarResena(Resena resena) {
        resenas.add(resena);
        System.out.println("Reseña registrada correctamente");
    }

    public void listarResenas() {
        if (resenas.isEmpty()) {
            System.out.println("No hay reseñas registradas");
            return;
        }
        System.out.println("LISTA DE RESEÑAS");
        for (Resena resena : resenas) {
            resena.mostrarResena();
        }
    }
}