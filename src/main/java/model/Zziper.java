package model;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zziper {
    List<String> list;

    public void method(String text) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(text+".zip"))) {

            for (String path : this.list) {
                byte[] fileContent = null;

                File file = new File(path);
                fileContent = Files.readAllBytes(file.toPath());

                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                System.out.println(file.getName());
                zipOutputStream.write(fileContent);
                zipOutputStream.closeEntry();
            }
        } catch (Exception exception) {

        }
    }

    public void getFiles(List<String> list) {
        this.list = list;
    }
    public void reset()
    {
        this.list=null;
    }
}
