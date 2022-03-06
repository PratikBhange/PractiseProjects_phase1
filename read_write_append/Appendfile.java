package read_write_append;
import java.io.BufferedOutputStream; 
import java.io.DataInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class Appendfile 
{ 
    public static void main(String[] args) throws IOException  
    { 
        DataInputStream dis=new DataInputStream(System.in); 
        FileOutputStream fout=new FileOutputStream("C:\\\\Javawork\\\\Phase 1\\\\Practice\\\\read_write_append_file\\\\test.txt",true); 
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end): "); 
        char ch; 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        //close the file 
        bout.close(); 
    } 
} 