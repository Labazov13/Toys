package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReposytoryFile {
    private String fileName;

    public ReposytoryFile(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveAllToys(Toy toy) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(toy.toString());
        writer.append("\n");
        writer.flush();
    }
}
