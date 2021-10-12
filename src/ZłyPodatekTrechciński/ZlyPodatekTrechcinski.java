package ZłyPodatekTrechciński;

import java.math.BigDecimal;

public class ZlyPodatekTrechcinski {
    public static void main(String[] args) {

        BigDecimal cena =
                new BigDecimal("9.99");
        BigDecimal iloscSprzedanychProduktow =
                new BigDecimal("10000");
        BigDecimal VAT =
                new BigDecimal("1.23");


        System.out.println("Cena netto: "+cena);
        cena = cena.multiply(VAT);
        System.out.println("Cena brutto: "+cena);
        cena = cena.multiply(iloscSprzedanychProduktow);
        System.out.println("Cena brutto 10000 sprzedanych produktów: "+cena);
        cena = cena.divide(VAT);
        System.out.println("Cena netto 10000 sprzedanych produktów: "+cena);
    }
}
