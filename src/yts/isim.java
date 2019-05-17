package yts;

import java.util.Scanner;

public class isim {

    private String ad;
    private String soyad;
    private String nick;

    public isim() {
        this.ad = "";
        this.soyad = "";
        this.nick = "";

    }

    public isim(String ad, String soyad, String nick) {
        this.ad = ad;
        this.soyad = soyad;
        this.nick = nick;
    }

    public isim(isim I) {
        this.ad = I.ad;
        this.soyad = I.soyad;
        this.nick = I.nick;
    }

    @Override
    public String toString() {
        return ad + " '" + nick + "' " + soyad;
    }

    public void girdi() {
        Scanner gir = new Scanner(System.in);
        System.out.print("İsim:");
        ad = gir.nextLine();
        System.out.print("Kullanıcı Adı:");
        nick = gir.nextLine();
        System.out.print("Soyad:");
        soyad = gir.nextLine();
    }
}
