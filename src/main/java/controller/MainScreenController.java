package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class MainScreenController {

    @FXML
    private Button filePicker;

    @FXML
    private TextField filePath;

    @FXML
    private TextField resultFilePath;

    @FXML
    void openFilePicker(ActionEvent event) {
openFileChooser();
    }

    @FXML
    void zzipIt(ActionEvent event) {

    }


    public void openFileChooser() {
        FileChooser fc = new FileChooser();  //Inicjalizacja fc


        File selectedFile = fc.showOpenDialog(null); //przypisz wybrany w fc plik do selectedFile
        fileIsNull(selectedFile,fc);
    }
    private void fileIsNull(File selectedFile,FileChooser fc) {
     /*   if (selectedFile != null) {
            listview.getItems().add(selectedFile.getAbsolutePath()); //dodaje wybrany plik do listyitemów
            this.extension = fc.getSelectedExtensionFilter().getDescription();

        } else {
            System.out.println("file is not valid");
        }
        */
    }

    private String getItem() {
       /* String absolutePath = (String) listview.getSelectionModel().getSelectedItem();
        if (absolutePath == null) {
            if(listview.getItems().get(0) == null)
            {
                throw new NullPointerException(" U have to choose item");
            }
            absolutePath = (String) listview.getItems().get(0);
        }
        System.out.println(absolutePath);
        return absolutePath;
    */
       return "";
    }


}
