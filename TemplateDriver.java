import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;


public class TemplateDriver {
    
    public void replaceTemplateText(String title,String camelTitle){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(title+"Copy.txt"));
            PrintWriter writer = new PrintWriter(
            new BufferedOutputStream(new FileOutputStream(title+".txt")));
            String str;
            while ((str = reader.readLine()) != null) { 
                str = str.replace("templateTitle", camelTitle);
                str = str.replace("Template", title); // replace string sequence
                
                writer.println(str);
            }
            writer.close();
            reader.close();
        }catch(IOException ioe){
        ioe.printStackTrace();
     }
    }

    public void copyTemplate(String templateTitle) {
        FileInputStream instream = null;
	    FileOutputStream outstream = null;
        String outputFileName = templateTitle+"Copy.txt";
    	try{
    	    File infile =new File("template.txt");
    	    File outfile =new File(outputFileName);
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }


    public void convertTxtToJava(String templateTitle) {
        FileInputStream instream = null;
	    FileOutputStream outstream = null;
    	try{
    	    File infile =new File(templateTitle+".txt");
    	    File outfile =new File(templateTitle+".java");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File converted successfully");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }

    public void cleanUpArtifacts(String title) {
        try
        {
            Files.deleteIfExists(Paths.get(title+".txt"));
            Files.deleteIfExists(Paths.get(title+"Copy.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
          
        System.out.println("Clean up successful.");
    }



    public static void main(String[] args) {
        TemplateDriver dri = new TemplateDriver();
        String title = args[0];
        String camelTitle = args[1];
        dri.copyTemplate(title);
        dri.replaceTemplateText(title, camelTitle);
        dri.convertTxtToJava(title);
        dri.cleanUpArtifacts(title);
    }

}


