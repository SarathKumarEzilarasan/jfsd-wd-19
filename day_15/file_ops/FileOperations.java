package day_15.file_ops;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileOperations {
    private static final String PATH = "src/day_15/file.txt";

    public static void main(String[] args) {
//        createWriteFile("hello world");
//        readFile();
//        AutoCloseable closeable = () -> System.out.println("object is closed");
//
//
//        try (closeable) {
//            System.out.println("from try");
//        } catch (Exception e) {
//
//        }

        Path path = Paths.get(PATH);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.writeString(path,"hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            List<String> lines = Files.readAllLines(path);
            lines.stream().forEach(line -> System.out.println(line));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void createWriteFile(String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(PATH));
            writer.write(content);
            System.out.println("Successfully wrote to the file...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void readFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(PATH));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void createWriteFileTry(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            writer.write(content);
            System.out.println("Successfully wrote to the file...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
