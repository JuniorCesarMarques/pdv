package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Path arquivo = Path.of(
                "C:\\Users\\20133399\\OneDrive - Yazaki\\Área de Trabalho\\teste.txt"
        );

        System.out.println(Files.readString(arquivo));
    }
}
