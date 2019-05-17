/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yts;

/**
 *
 * @author Kutuphne
 */
public class PembeYoldas extends Yoldas {

    private String race;

    public PembeYoldas(String renk, isim ad, tarih dt, String rutbe, String cinsiyet, int yas, int kimlik_no) {
        super(ad, dt, rutbe, cinsiyet, yas, kimlik_no);
        this.race = "pembe";

        System.out.println("Yoldaş detayları");

        System.out.println("Mevki :" + rutbe);
        System.out.println("Ad :" + ad);
        System.out.println("Doğum tarihi :" + dt);
        System.out.println("Kimlik No :" + kimlik_no);
        System.out.println("Cinsiyet :" + cinsiyet);
        System.out.println("Boy : " + boy);
        System.out.println("Yaş :" + yas);
        System.out.println("Irk" + race);

    }

    public PembeYoldas(String race, Yoldas Y) {
        super(Y);
        this.race = "pembe";

    }

    public PembeYoldas(String race) {
        this.race = "pembe";

    }

    @Override
    public String toString() {
        return "Yoldaş Rengi :" + race;
    }

    PembeYoldas() {
        throw new UnsupportedOperationException("Pembe Yoldaş");

    }
}
