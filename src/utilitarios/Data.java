package utilitarios;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Data {
    
    
    public void data(){
        
        LocalDate localDate = LocalDate.now();
        Date date = Date.from(Instant.now());
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String data = format.format(date);
        
        System.out.println(data);
        
    }
    
    public static void main(String args[]){
        
        Data d = new Data();
        d.data();
        
    }
    
}
