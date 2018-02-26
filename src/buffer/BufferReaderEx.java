package buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderEx {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileReader fr;

        try {
            String filepath = "";
            fr = new FileReader(new File(filepath));
            bufferedWriter = new BufferedWriter(new FileWriter(filepath));

            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {

                bufferedWriter.write(line);

                bufferedWriter.newLine();

                line = br.readLine();
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
