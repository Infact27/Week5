
package oop;

import java.util.GregorianCalendar;

public class Week5Nomor2 {

    
    public static void main(String[] args) {
    GregorianCalendar TANGGAL = new GregorianCalendar();
        final String[] month = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        long WAKTUYANGDILEWATI = TANGGAL.getTimeInMillis();


        System.out.println(
                "Saat ini adalah tanggal " + TANGGAL.get(GregorianCalendar.DAY_OF_MONTH) +
                        " " + month[TANGGAL.get(GregorianCalendar.MONTH)] +
                        " " + TANGGAL.get(GregorianCalendar.YEAR)
        );
        
        if(WAKTUYANGDILEWATI >= 3.156e+10) {
            System.out.print((int) (WAKTUYANGDILEWATI / 3.154e+10) + " tahun ");
            WAKTUYANGDILEWATI %= 3.156e+10;
        }
        if(WAKTUYANGDILEWATI >= 2.628e+9) {
            System.out.print((int) (WAKTUYANGDILEWATI / 2.628e+9) + " bulan ");
            WAKTUYANGDILEWATI %= 2.628e+9;
        }
        if(WAKTUYANGDILEWATI >= 8.64e+7) {
            System.out.print((int) (WAKTUYANGDILEWATI / 8.64e+7) + " hari ");
        }        
        System.out.print("sejak 1 Januari 1970");
    }
    
    
}
