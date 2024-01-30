import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFile {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        FileInputStream inputFileStream = null; // File input stream
        Scanner inFS = null;                    // File Scanner object

        FileOutputStream outputFileStream = null;
        PrintWriter outFS = null;

        String lineString = "";                 // Stores line-by-line input from file
        char yesNo = 'n';
        String updateName = "";
        String updateNum = "";

        String[] fileContents = new String[50]; // Array for storing and updating file contents
        int size = 0;
        int i = 0;
        boolean entryFound = false;

        System.out.println("Would you like to update allWork.csv?");
        yesNo = scnr.next().charAt(0);
        scnr.nextLine();

        while (yesNo == 'y') {
            size = 0;
            inputFileStream = new FileInputStream("allWorks.csv");
            inFS = new Scanner(inputFileStream);

            System.out.println("Which entry would you like to update?");
            updateName = scnr.nextLine();

            while (inFS.hasNext()) {
                lineString = inFS.nextLine();

                if(lineString.indexOf(updateName) == 0) {
                    entryFound = true;
                    System.out.println("Enter a new value for " + updateName);
                    updateNum = scnr.next();
                    lineString = updateName + "," + updateNum;
                }

                // Storing each line in the array
                fileContents[size] = lineString;
                ++size;
            }


            if (!entryFound) {
                System.out.println("Entry not found. Add new entry?");
                yesNo = scnr.next().charAt(0);
                scnr.nextLine();

                if(yesNo == 'y') {
                    System.out.println("Number of works?");
                    updateNum = scnr.next();
                    //size = size + 1;
                    lineString = updateName + "," + updateNum;
                    fileContents[size] = lineString;
                }
            }

            outputFileStream = new FileOutputStream("allWorks.csv");
            outFS = new PrintWriter(outputFileStream);
            
            int j = 0;

            while (fileContents[j] != null){
                outFS.println(fileContents[j]);
                //System.out.println(fileContents[j]);
                outFS.flush();
                j++;
            }

            System.out.println("Would you like to continue to update allWork.csv?");
            yesNo = scnr.next().charAt(0);
            if (yesNo == 'y'){
                scnr.nextLine();
            }

        }

        outputFileStream.close(); // close() may throw IOException if fails
    }
}