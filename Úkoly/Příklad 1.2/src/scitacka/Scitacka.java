package scitacka;

import java.math.BigInteger;

/**
 * Trida Scitacka predstavuje model scitacky, ktera pouze umi secist dve cela
 * cisla typu BigInteger. Kazda instance teto tridy uchovava dve cela cisla typu
 * BigInteger, ktera se daji menit a je mozne kdykoliv urcit jejich soucet
 * pomoci metody soucet().
 *
 * @author Jaroslav Icha
 * @author Pavel Máca
 * @version 21.2.2016
 */
public class Scitacka {

    // instancni promenne, ktere uchovavaji dve cisla a jejich soucet
    private BigInteger cislo1;
    private BigInteger cislo2;
    private BigInteger soucet;

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na hodnoty dane parametry cislo1 a cislo2.
     *
     * @param cislo1 levy scitanec
     * @param cislo2 pravy scitanec
     */
    public Scitacka(BigInteger cislo1, BigInteger cislo2) {
        this.setCislo1(cislo1);
        this.setCislo2(cislo2);
    }

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na nulu.
     */
    public Scitacka() {
        this(BigInteger.ZERO, BigInteger.ZERO);
    }

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na hodnotu danou parametrem cislo.
     *
     * @param cislo spolecna hodnota obou scitancu
     */
    public Scitacka(BigInteger cislo) {
        this(cislo, cislo);
    }


    /**
     * Vypočítá součet řady 1+1+1+....+1, kde počet jendiček je dán parametrem pocetJednicek
     *
     * @param pocetJednicek Poučet jedniček k sečtení.
     * @return výsledný součet
     * @throws Exception Pokud je naplatný paramter
     */
    public static BigInteger soucetJednicek(BigInteger pocetJednicek) throws Exception {
        if (pocetJednicek.signum() == -1) {
            throw new Exception("Počet sečtení musý být nezáporné číslo.");
        }
        Scitacka scitacka = new Scitacka(BigInteger.ZERO);

        BigInteger cislo1 = BigInteger.ONE;
        for (int i = 1; pocetJednicek.compareTo(BigInteger.valueOf(i)) > -1; i++) {
            BigInteger cislo2 = scitacka.getSoucet();
            scitacka.setCislo1ACislo2(cislo1, cislo2);
        }

        return scitacka.getSoucet();
    }

    /**
     * Vraci hodnotu leveho scitance.
     *
     * @return Metoda vraci hodnotu scitance cislo1 z vyrazu cislo1 + cislo2,
     * ktery se da vyhodnotit pomoci metody soucet().
     */
    public BigInteger getCislo1() {
        return cislo1;
    }

    /**
     * Vraci hodnotu praveho scitance.
     *
     * @return Metoda vraci hodnotu scitance cislo2 z vyrazu cislo1 + cislo2,
     * ktery se da vyhodnotit pomoci metody soucet().
     */
    public BigInteger getCislo2() {
        return cislo2;
    }

    /**
     * Metoda nastavi hodnotu leveho scitance pomoci parametru cislo1.
     *
     * @param cislo1 hodnota typu BigInteger, ktera se pouzije k nastaveni
     *               leveho scitance
     */
    public void setCislo1(BigInteger cislo1) {
        this.cislo1 = cislo1;
        this.soucet();
    }

    /**
     * Metoda nastavi hodnotu leveho scitance pomoci parametru cislo1.
     *
     * @param cislo1 hodnota typu BigInteger, ktera se pouzije k nastaveni
     *               leveho scitance
     * @param cislo2 hodnota typu BigInteger, ktera se pouzije k nastaveni
     *               praveho scitance
     */
    public void setCislo1ACislo2(BigInteger cislo1, BigInteger cislo2) {
        setCislo1(cislo1);
        setCislo2(cislo2);
    }

    /**
     * Metoda nastavi hodnotu praveho scitance pomoci parametru cislo2.
     *
     * @param cislo2 hodnota typu BigInteger, ktera se pouzije k nastaveni
     *               praveho scitance
     */
    public void setCislo2(BigInteger cislo2) {
        this.cislo2 = cislo2;
        this.soucet();
    }

    /**
     * Vypočítá soucet dvou cisel typu BigInteger, ktera jsou ulozena v instanci.
     */
    private void soucet() {
        if (cislo1 != null && cislo2 != null) {
            //System.out.println("sum: " + cislo1 + " + " + cislo2);
            soucet = cislo1.add(cislo2);
        }
    }

    public BigInteger getSoucet() {
        return soucet;
    }

    /**
     * Vraci znakovou reprezentaci instance, ktera popisuje jeji stav.
     *
     * @return Vraci objekt typu String, ktery obsahuje hodnoty obou scitanych
     * cisel. Priklad: "Scitacka{cislo1 = 23, cislo2 = 123, soucet = 146}".
     */
    @Override
    public String toString() {
        return "Scitacka{" + "cislo1=" + cislo1 + ", cislo2=" + cislo2 + ", soucet=" + soucet + "}";
    }

    /**
     * Testovaci metoda, ktera vytvori novou scitacku, kterou inicializuje
     * pomoci parametru levyScitanec a pravyScitenec. Potom vytiskne oba
     * scitance a jejich soucet.
     *
     * @param levyScitanec  levy scitanec
     * @param pravyScitanec pravy scitanec
     */
    public static void testScitacka(BigInteger levyScitanec, BigInteger pravyScitanec) {
        Scitacka scitacka = new Scitacka(levyScitanec, pravyScitanec);
        System.out.println(scitacka);
        BigInteger cislo1 = scitacka.getCislo1();
        BigInteger cislo2 = scitacka.getCislo2();
        BigInteger soucet = scitacka.getSoucet();
        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);
        System.out.println();
    }

    public static void testScitaniJednicek(BigInteger pocetJednicek) {
        try {
            BigInteger soucet = Scitacka.soucetJednicek(pocetJednicek);
            String kontrola = pocetJednicek.equals(soucet) ? "OK" : "FAIL";
            System.out.println("Počet jedniček: " + pocetJednicek + " součet: " + soucet + " test: " + kontrola);
            System.out.println();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testScitacka(BigInteger.ZERO, BigInteger.ZERO);

        testScitacka(new BigInteger("5"), new BigInteger("5"));

        testScitacka(new BigInteger("5"), new BigInteger("10"));

        testScitacka(new BigInteger("111111111111111111"), new BigInteger("222222222222222222222222"));

        testScitacka(new BigInteger("" + Integer.MAX_VALUE), BigInteger.ONE);

        testScitacka(new BigInteger("" + Integer.MAX_VALUE), new BigInteger("" + Integer.MAX_VALUE));

        testScitacka(new BigInteger("" + Integer.MIN_VALUE), new BigInteger("" + Integer.MIN_VALUE));

        testScitaniJednicek(new BigInteger("156"));

        testScitaniJednicek(new BigInteger("0"));

        testScitaniJednicek(new BigInteger("-156"));

        testScitaniJednicek(new BigInteger("222222222222222222222222"));
    }

}
