/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexcercise10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author ELCOT
 */
public class binaryfiles {
    
    public static void main(String[] args) throws Exception {
        
        //program using character stream for binary files
         FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("input.jpg");
        fou=new FileWriter("output.jpg");
        int i;
        while((i=fio.read())!= -1)
        fou.write(i);
        
        //program using byte stream for binary files
        FileInputStream fi =null;
        FileOutputStream fo =null;
        fi=new FileInputStream("input.jpg");
        fo=new FileOutputStream("output.jpg");
        int j;
        while((j=fi.read())!=-1)
        {
            fo.write(j);
        }
        
    }
}
