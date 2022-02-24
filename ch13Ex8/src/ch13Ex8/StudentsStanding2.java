package ch13Ex8;
import java.nio.file.*;
import java.io.*;

import static java.nio.file.StandardOpenOption.*;

public class StudentsStanding2 {

        public static void main(String[] args) {

                Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");

                Path probFile = Paths
                                .get("/root/sandbox/StudentsAcademicProbation.txt");

                // Write your code here
                try {
                        InputStream goodStandingFile = new BufferedInputStream(
                                        Files.newInputStream(goodFile));
                        BufferedReader goodStandingFileReader = new BufferedReader(
                                        new InputStreamReader(goodStandingFile));
                        InputStream acadProbationStream = new BufferedInputStream(
                                        Files.newInputStream(probFile));
                        BufferedReader acadProbationStreamReader = new BufferedReader(
                                        new InputStreamReader(acadProbationStream));
                        System.out.println("Probationary Standing\n");
                        String line = "";
                        while (line != null) {
                                line = acadProbationStreamReader.readLine();
                                if (line != null) {
                                        display(line);
                                }
                        }
                        System.out.println();
                        System.out.println("Good Standing\n");
                        line = "";
                        while (line != null) {
                                line = goodStandingFileReader.readLine();
                                if (line != null) {
                                        display(line);
                                }
                        }
                        System.out.println();
                        goodStandingFileReader.close();
                        acadProbationStreamReader.close();
                        goodStandingFile.close();
                        acadProbationStream.close();
                } catch (IOException e) {
                        System.out.println("Error: " + e);
                }

        }

        public static void display(String s) {

                // Write your code here
                String words[] = s.split(",");
                double gradeAverage = Double.parseDouble(words[3]);
                double diff = gradeAverage - 2.0;
                System.out.println("ID #" + words[0] + "  " + words[1] + "  "
                                + words[2] + "  GPA: " + gradeAverage + "    " + diff
                                + " from " + 2.0 + " cutoff");

        }

}