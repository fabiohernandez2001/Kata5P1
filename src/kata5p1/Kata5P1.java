
package kata5p1;

import java.io.IOException;
import java.util.List;


public class Kata5P1 {
    public static void main(String[] args) throws IOException{
        MailListReader R= new MailListReader(); 
        InsertarDatosTabla idt= new InsertarDatosTabla();
        String filename = "/Users/Entrar/Documents/NetBeansProjects/Kata5P1/email.txt";
        List<String> maiList=R.read(filename);
        for (String mail : maiList) {
            idt.insert(mail);
        }
    }
    
}
