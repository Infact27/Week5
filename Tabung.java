
package oop;


public class Tabung {
    double RADIUS, TINGGI;
        
    Tabung(double R, double T){
        RADIUS = R;
        TINGGI = T;
    }
    
    public double VOLUME() {
        return LUASALAS() * TINGGI;
    }

    public double LUASALAS() {
        return Math.PI * Math.pow(RADIUS, 2);
    }
}
