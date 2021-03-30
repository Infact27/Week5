
package oop;


public class Week5Nomor1 {

    
    public static void main(String[] args) {
        Tabung obj1 = new Tabung(5, 10);
        Tabung obj2 = new Tabung(7.5, 15.5);

        System.out.println("Object pertama :");
        System.out.println(" radius = " + obj1.RADIUS);
        System.out.println(" tinggi = " + obj1.TINGGI);
        System.out.println(" luas alas = " + obj1.LUASALAS());
        System.out.println(" volume = " + obj1.VOLUME());
        System.out.println("Object kedua :");
        System.out.println(" radius = " + obj2.RADIUS);
        System.out.println(" tinggi = " + obj2.TINGGI);
        System.out.println(" luas alas = " + obj2.LUASALAS());
        System.out.println(" volume = " + obj2.VOLUME());
    }
    
}
