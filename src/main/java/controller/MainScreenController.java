package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import model.Zziper;
import java.awt.*;
import java.io.File;
import java.util.List;

public class MainScreenController {

    Zziper zziper;

String outputPath;

    @FXML
    private Button filePicker;

    @FXML
    private TextField resultFilePath;

    @FXML
    private ListView listView;

    @FXML
    public void initialize()
    {
        zziper = new Zziper();
        this.resultFilePath.setText(System.getProperty("user.dir")+"\\zippedfiles.zip");
        outputPath=null;
    }
    @FXML
    void openFilePicker(ActionEvent event) {
this.listView.getItems().add(Files.openFileChooser(this.listView));
    }

    @FXML
    void zzipIt(ActionEvent event) {
        List<String> list = this.listView.getItems();
        this.zziper.getFiles(list);
        this.zziper.method(this.resultFilePath.getText());
        FileChooser directoryChooser = new FileChooser();
        if (outputPath==null) {
            directoryChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
            directoryChooser.showOpenDialog(null);
        }
        else
        {
            directoryChooser.setInitialDirectory(new File(this.outputPath));
            directoryChooser.showOpenDialog(null);

        }
        }

    @FXML
    void removeAll(ActionEvent event) {
this.listView.getItems().remove(0,this.listView.getItems().size());
this.zziper.reset();
    }

    @FXML
    void removeById(ActionEvent event) {
this.listView.getItems().remove(this.listView.getSelectionModel().getSelectedIndex());
    }

    @FXML
    public void chooseDir()
    {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File file = directoryChooser.showDialog(null);
        this.outputPath = file.getAbsolutePath();
        this.resultFilePath.setText(outputPath+"\\zzipowany.zip");
    }



}
