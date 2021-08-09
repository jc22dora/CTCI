import java.io.File;
import java.io.IOException;

public class templateDriver {

    public void create(String templateTitle) {
        // duplicate template.txt
        // rewrite 'template' with templateTitle
        // save
        // convert new txt file to java file

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
    public static void main(String[] args) {
        templateDriver dri = new templateDriver();
        dri.create("1");
    }
    
}
