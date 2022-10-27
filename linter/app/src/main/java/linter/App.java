package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public String getGreeting(){
        return "That was something...";
    }
    public static void main(String[] args) {
//        Path linterPath = Paths.get("gates.js");
//        System.getProperty("user.dir"); //from Ben!
        readBufferTryWithResources("gates.js");
    }

    // Read with BufferedReader try with resources
    public static void readBufferTryWithResources(String filePath) {
        Path path = Paths.get(filePath);
        int counter = 0;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();

//            line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                boolean goAhead = true;
                counter += 1;
                if (line.isEmpty() || line.endsWith("{") || line.endsWith("}") || line.contains("if") || line.contains("else")) {
                    goAhead = false;
//                    System.out.println("do not touch me");
                }
                else if (goAhead  && !line.endsWith(";")) {
                    System.out.println("Line " + counter + " missing semicolon.");
                }
                line = reader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

