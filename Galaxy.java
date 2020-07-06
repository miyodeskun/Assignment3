
import java.io.*;



/**
 * SIMILARITIES OF ALL GALAXY
 * @author Amirul Luqman
 */
public class Galaxy implements Serializable { // Parents of all subclass (SUPERCLASS)
    
    private String shape, name, bulge, gasDust;
    private String size = "Size: Huge";
    private String contents = "Contents: Stars, gas and dust.";
    private String character = "Characterisitc: Held together by gravity."; 
    
    public Galaxy (String name, String shape, String size, String content,
            String character, String bulge, String gasDust){
        this.name = name;
        this.shape = shape;
        this.size = size;
        this.bulge = bulge;
        this.gasDust = gasDust;
        this.contents = contents;
        this.character = character;
    }

    public String getShape() {
        return this.shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBulge() {
        return this.bulge;
    }

    public void setBulge(String bulge) {
        this.bulge = bulge;
    }

    public String getGasDust() {
        return this.gasDust;
    }

    public void setGasDust(String gasDust) {
        this.gasDust = gasDust;
    }
    
    // DEFAULT VALUE
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return this.size;
    }
    public void setContent(String contents){
        this.contents = contents;

    }    
    public String getContent(){
        return this.contents;
    }
     public void setCharacter(String character){       
        this.character = contents;  
     }
    public String getCharacteristic(){
        return this.character;
    }

}
        
        


// ASSINGMENT 1   
//    public void setName(String name){
//        this.name = name;
//    }
//    public void getName(){
//        System.out.println("Name: " + name + " Galaxy");
//    }
//    public void setShape(String shape){
//        this.shape = shape;
//    }
//    public void getShape(){
//        System.out.println("Shape: " + shape);
//    }
//    public void getSize(){
//        System.out.println("Size: Huge");
//    }
//    public void getContent(){
//        System.out.println("Contents: Stars, gas and dust.");
//    }
//    public void getCharacteristic(){
//        System.out.println("Characterisitc: Held together by gravity.");
//    }
//    public void getBulge(){
//    System.out.println("Bulge: " + bulge);
//    }
//    public void getGasDustDetails(){
//    System.out.println("Gas & Dust: " + gasDust);
//    }
//    
//}
