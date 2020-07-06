
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Amirul Luqman
 */
public class Main { // Main class to check all the subclass
    public static void main(String[]args) throws IOException{
        /*  Galaxy1 = Spiral Galaxy
            Galaxy2 = Elliptical Galaxy
            Galaxy3 = Irregular Galaxy
        */
        Galaxy1 x = new Galaxy1(); // Galaxy Class No.1
        
        // SETTER
        x.setName("Spiral Galaxy"); // Set Galaxy Name
        x.setShape("Round-to-oval"); // Set Galaxy Shape
        
        // GETTER
        System.out.println(x.getName()); 
        System.out.println(x.getShape());
        x.getSize();
        x.getContent();
        x.getCharacteristic();
        System.out.println("Bulge: " + x.getBulge());
        System.out.println("Gas and dust: " + x.getGassDustDetails());
        // End of print for Spiral Galaxy
        x.printList();
        
        File file = new File ("/Users/User/Desktop/Galaxy.txt");
        Scanner scan = new Scanner (file);
        
        String fileContent = "";
        
        while (scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }    
    }
}
