/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author PRAVEENAGRUD
 */
public class FileOp {
    public static void main(String[] args){
        File fileObject = new File("d:/java/file/MyFile.txt");
        char[] array = new char[1000];
        try{
            boolean getValue = fileObject.createNewFile();
            if(getValue)
                System.out.println("New File is created");
            else
                System.out.println("The file already exists !!");
            FileReader input = new FileReader("d:/java/file/MyFile.txt");
            FileWriter output = new FileWriter("d:/java/file/Output.txt");
            input.read(array);
            System.out.println("Data collected");
            System.out.println(array);
            output.write(array);
            System.out.println("Data is written to the file  !!!!");
            input.close();
            output.close();
        }
        catch(Exception e){
               System.out.println("Something went wrong !!!!!");
        }
    }
    
}
