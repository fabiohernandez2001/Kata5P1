
package kata5p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class MailListReader {
    
    
    public List<String> read(String filename) throws FileNotFoundException, IOException{
        LinkedList<String> MailList = new LinkedList<>();
        String cadena;
        FileReader f = new FileReader(filename);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            if(cadena.contains("@")){
                String mail = cadena;
                MailList.add(mail);
            }
        }
        return MailList;
            
    }
}
