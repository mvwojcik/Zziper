package controller;

import javafx.scene.control.ListView;
import javafx.stage.FileChooser;


import java.io.File;
import java.io.IOException;

public class Files {

    public static String openFileChooser(ListView listView) {
        FileChooser fc = new FileChooser();  //Inicjalizacja fc


        File selectedFile = fc.showOpenDialog(null); //przypisz wybrany w fc plik do selectedFile

        return fileIsNull(selectedFile);
    }

    private static String fileIsNull(File selectedFile) {
        if (selectedFile != null) {
            return selectedFile.getAbsolutePath();
        } else {
            throw new NullPointerException();//tu fajniejszy throw z okienkiem
        }

    }


}
