package ch13Ex8;
import java.nio.file.*;

import java.io.*;

import static java.nio.file.StandardOpenOption.*;

import java.util.Scanner;

public class StudentsStanding {

        public static void main(String[] args) {

                Path goodFile = Paths.get("/root/sandbox/StudentsGoodStanding.txt");

                Path probFile = Paths
                                .get("/root/sandbox/StudentsAcademicProbation.txt");

                // Write your code here

                Scanner sc = new Scanner(System.in);
                try {
                        Files.deleteIfExists(goodFile);
                        Files.deleteIfExists(probFile);
                        Files.createDirectories(goodFile.getParent());
                        OutputStream goodStandingFile = new BufferedOutputStream(
                                        Files.newOutputStream(goodFile, CREATE_NEW));
                        BufferedWriter goodStandingFileWriter = new BufferedWriter(
                                        new OutputStreamWriter(goodStandingFile));
                        OutputStream acadProbationStream = new BufferedOutputStream(
                                        Files.newOutputStream(probFile, CREATE_NEW));
                        BufferedWriter acadProbationStreamWriter = new BufferedWriter(
                                        new OutputStreamWriter(acadProbationStream));
                        while (true) {
                                System.out.println("Enter ID Num (ZZZ to quit): ");
                                String studentID = sc.nextLine();
                                if (!studentID.equals("ZZZ")) {
                                        System.out.println("Enter first Name: ");
                                        String firstName = sc.nextLine();
                                        System.out.println("Enter last Name: ");
                                        String lastName = sc.nextLine();
                                        System.out.println("Enter Grade Point Average: ");
                                        double gradeAverage = Double.parseDouble(sc.nextLine());
                                        String output = studentID + "," + firstName + ","
                                                        + lastName + "," + gradeAverage + "\n";
                                        if (gradeAverage < 2.0) {
                                                acadProbationStreamWriter.write(output, 0,
                                                                output.length());
                                        } else {
                                                goodStandingFileWriter
                                                                .write(output, 0, output.length());
                                        }
                                } else {
                                        break;
                                }
                        }
                        acadProbationStreamWriter.close();
                        goodStandingFileWriter.close();
                        goodStandingFile.close();
                        acadProbationStream.close();
                } catch (IOException e) {
                        System.out.println("Error: " + e);
                }

        }

}