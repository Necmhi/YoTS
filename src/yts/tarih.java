/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yts;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tarih {

    private int gun;
    private int ay;
    private int yil;

    public tarih() {
        this.gun = 0;
        this.ay = 0;
        this.yil = 0;

    }

    public tarih(int gun, int ay, int yil) {
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;

    }

    public tarih(tarih Tarih) {
        this.gun = Tarih.gun;
        this.ay = Tarih.ay;
        this.yil = Tarih.yil;

    }

    @Override
    public String toString() {
        return gun + "/" + ay + "/" + yil;
    }

    public void girdi() {
        Scanner gir = new Scanner(System.in);
        System.out.println("Doğum tarihiniz(G/A/Y):");
        System.out.print("Gün:");
        gun = gir.nextInt();
        System.out.print("Ay:");
        ay = gir.nextInt();
        System.out.print("Yıl:");
        yil = gir.nextInt();
    }
}
