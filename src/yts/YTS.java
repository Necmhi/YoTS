package yts;

import java.io.*;

public class YTS {

    public static void main(String[] args) throws FileNotFoundException {
   /*     File file = new File("E:\\ \\Proje İkbal\\YTS\\bilgic.txt");
        PrintWriter out1=new PrintWriter(file); 
        if (file.exists()) {
            System.out.println("Filemiz zateyn var");
            System.exit(0);
        }
        // Create a file
        PrintWriter output = new PrintWriter(file);
// Write formatted output to the file
        out1.println();
        
        */
        
// Close the file
        

        tarih t = new tarih(06, 03, 2000);
        System.out.println("" + t);
        isim i = new isim("Muhammed İkbal", "Kılıç", "Necmhi");
        System.out.println(" " + i);

        System.out.println("Çapulcu");

        System.out.println("  ");
        Yoldas y = new Yoldas();
        
        y.girdi();
        y.dosyaYaz();
        y.yazdir();
        

    }

}
