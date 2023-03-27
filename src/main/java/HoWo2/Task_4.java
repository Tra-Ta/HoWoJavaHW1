package HoWo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task_4 {
    public static void main(String[] args) {
        String output = generateTestString(100);
        writeToFile("test.txt", output);
    }

    private static String generateTestString(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("TEST ");
        }
        return sb.toString();
    }

    private static void writeToFile(String fileName, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
