import java.io.*;

public class PetList {

    final static int MAX_NUM_PET = 20; 
    private static final String INPUT_FILE = "./pet_data.csv";
    private static final String OUTPUT_FILE = "./pet_report.txt";

    private static String[] petData;
    private static Pet[] pets;
    private static int numPets = 0;

    public static void main (String[] args) {
        retrievePetData();
        convertPetDataToPetObjects();
        writeOutput();
    }

    private static void retrievePetData() {
        petData = new String[MAX_NUM_PET];
       
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))) { 
            String line;
            while ((line = br.readLine()) != null) {
                petData[numPets] = line;
                numPets++;      
            }
            br.close();
        } catch (Exception e) {
            System.out.print(e.getClass().getName() + " ");
            System.out.println(e.getMessage());
        }
    }

    private static void convertPetDataToPetObjects() {

    }

    private static void writeOutput () {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(OUTPUT_FILE)); 
            writePetObjects(pw);
            writePetStatistics(pw);
            pw.close();
        } catch (Exception e) {
            System.out.print(e.getClass().getName() + " ");
            System.out.println(e.getMessage());
        }
    }

    private static void writePetObjects (PrintWriter pw) {
        if (pets != null) {
            for (Pet aPet: pets) {
                if (aPet != null) pw.println(aPet.toString()); 
            } 
        }
    }

    private static void writePetStatistics (PrintWriter pw) {
        int numberOfCats = 0;
        int numberOfDogs = 0;
        float averageCatAge = 0.0f;
        float averageDogAge = 0.0f;

        pw.println("Number of cats: " + numberOfCats);
        pw.println("Number of dogs: " + numberOfDogs);
        pw.println("Average cat age: " + averageCatAge);
        pw.println("Average dog age: " + averageDogAge);
    }

}
