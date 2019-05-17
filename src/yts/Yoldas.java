package yts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Yoldas {

    protected float boy;
    protected String cinsiyet;
    protected int yas;
    protected String kimlik_no;
    protected isim ad;
    protected tarih dt;
    protected String rutbe;

    public Yoldas(isim ad, tarih dt, String rutbe, String cinsiyet, int yas, int kimlik_no) {
        this.ad = new isim(ad);
        this.dt = new tarih(dt);
        this.rutbe = rutbe;
        this.boy = boy;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.kimlik_no = "kimlik_no";
    }

    public Yoldas(Yoldas Y) {
        this.boy = Y.boy;
        this.cinsiyet = Y.cinsiyet;
        this.yas = Y.yas;
        this.kimlik_no = Y.kimlik_no;
        this.ad = Y.ad;
        this.dt = Y.dt;
        this.rutbe = Y.rutbe;
    }

    public Yoldas() {
        this.ad = new isim();
        this.dt = new tarih();
        this.kimlik_no = "00001347v";
        this.cinsiyet = "E";
        this.rutbe = "Yoldaş";
    }

    @Override
    public String toString() {
        return "Yoldas" + ad;
    }

    public void girdi() {
        Scanner gir = new Scanner(System.in);
        System.out.println("Yoldaş Bilgisi girin");
        ad.girdi();
        dt.girdi();
        System.out.println("Mevkiniz :");
        rutbe = gir.nextLine();
        System.out.println("Cinsiyet (E/K) :");
        cinsiyet = gir.nextLine();

        System.out.println("Kimlik No:");
        kimlik_no = gir.nextLine();

        System.out.println("Boyunuz :");
        boy = gir.nextFloat();

        System.out.println("Yaşınız: ");
        yas = gir.nextInt();

    }

    public void yazdir() {
        System.out.println("Yoldaş detayları");
        System.out.println("Mevki :" + rutbe);
        System.out.println("Ad :" + ad);
        System.out.println("Doğum tarihi :" + dt);
        System.out.println("Kimlik No :" + kimlik_no);
        System.out.println("Cinsiyet :" + cinsiyet);
        System.out.println("Boy : " + boy);
        System.out.println("Yaş :" + yas);

    }

    public void dosyaYaz() throws FileNotFoundException {
        File file = new File("dosya.txt");
        PrintWriter out1 = new PrintWriter(file);
       
        // Create a file
        PrintWriter output = new PrintWriter(file);
// Write formatted output to the file
        out1.println(ad);
        out1.println(dt);
        out1.println(rutbe);
        out1.println(cinsiyet);
        out1.println(kimlik_no);
        out1.println(boy);
        out1.println(yas);
        output.close();
    }
}
