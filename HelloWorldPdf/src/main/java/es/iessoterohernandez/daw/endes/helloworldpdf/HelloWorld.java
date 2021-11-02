
package es.iessoterohernandez.daw.endes.helloworldpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.BaseColor;
       
public class HelloWorld {
    public static void main(String[] args) {
    Document documento=new Document();
   
    
    
    
    documento.open();
    
    documento.addTitle("Hola Mundo");
    
    documento.close();
        
    }
    
   
    
}
