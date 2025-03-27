import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Gradebook {

public static ArrayList<String> firstNames = new ArrayList<>();
public static ArrayList<String> lastNames = new ArrayList<>();
public static ArrayList<Double> gpas = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        
        readInStudentData();
        
        // Print table header
        System.out.printf("%-15s %-15s %-5s\n", "First Name", "Last Name", "GPA");
        System.out.println("----------------------------------------");

        //Your code here!!!
    }

    public static void printGradebook(){
        for (int i = 0; i < firstNames.size(); i++) {
            System.out.printf("%-15s %-15s %-5.2f\n",
                firstNames.get(i),
                lastNames.get(i),
                gpas.get(i));
        }
    }

    public static void readInStudentData() throws IOException{
        Scanner fileScanner = new Scanner(new File("lib/students.dat"));

        while (fileScanner.hasNext()) {
            String firstName = fileScanner.next();
            String lastName = fileScanner.next();
            double gpa = fileScanner.nextDouble();

            firstNames.add(firstName);
            lastNames.add(lastName);
            gpas.add(gpa);
        }

        fileScanner.close();
    }
}
