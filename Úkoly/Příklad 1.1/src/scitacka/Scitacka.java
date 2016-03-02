package scitacka;

/**
 * Trida Scitacka predstavuje model scitacky, ktera pouze umi secist dve cela
 * cisla typu int. Kazda instance teto tridy uchovava dve cela cisla typu int,
 * ktera se daji menit a jejich soucet typu long.
 *
 * @author Jaroslav Icha
 * @author Pavel Máca
 * @version 21.2.2016
 */
public class Scitacka {

    // instancni promenne, ktere uchovavaji dve cisla, ktera se budou scitat
    private int cislo1;
    private int cislo2;

    // proměnná, které uchovává aktuální součet cislo1 a cislo2
    private long soucetLong;

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na hodnoty dane parametry cislo1 a cislo2.
     * Nastaý hodnotu souctu ve vnitřní promměnné.
     *
     * @param cislo1 levy scitanec
     * @param cislo2 pravy scitanec
     */
    public Scitacka(int cislo1, int cislo2) {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;

        this.soucetLong();
    }

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na nulu.
     */
    public Scitacka() {
        this(0, 0);
    }

    /**
     * Konstruktor pro objekty tridy Scitacka, ktery nastavi hodnoty obou
     * scitanych cisel na hodnotu danou parametrem cislo.
     *
     * @param cislo spolecna hodnota obou scitancu
     */
    public Scitacka(int cislo) {
        this(cislo, cislo);
    }

    /**
     * Vraci hodnotu leveho scitance.
     *
     * @return Metoda vraci hodnotu scitance cislo1 z vyrazu cislo1 + cislo2,
     * ktery se da vyhodnotit pomoci metody soucet().
     */
    public int getCislo1() {
        return cislo1;
    }

    /**
     * Vraci hodnotu praveho scitance.
     *
     * @return Metoda vraci hodnotu scitance cislo2 z vyrazu cislo1 + cislo2,
     * ktery se da vyhodnotit pomoci metody soucet().
     */
    public int getCislo2() {
        return cislo2;
    }

    /**
     * Metoda nastavi hodnotu leveho scitance pomoci parametru cislo1
     * a aktualizuje hodnotu souctu ve vnitřní promměnné.
     *
     * @param cislo1 hodnota typu int, ktera se pouzije k nastaveni leveho
     *               scitance
     */
    public void setCislo1(int cislo1) {
        this.cislo1 = cislo1;
        this.soucetLong();
    }

    /**
     * Metoda nastavi hodnotu leveho a praveho scitance pomoci parametru cislo1
     * a cislo2.
     *
     * @param cislo1 hodnota typu int, ktera se pouzije k nastaveni leveho
     *               scitance
     * @param cislo2 hodnota typu int, ktera se pouzije k nastaveni praveho
     *               scitance
     */
    public void setCislo1ACislo2(int cislo1, int cislo2) {
        setCislo1(cislo1);
        setCislo2(cislo2);
    }

    /**
     * Metoda nastavi hodnotu praveho scitance pomoci parametru cislo2
     * a aktualizuje hodnotu souctu ve vnitřní promměnné.
     *
     * @param cislo2 hodnota typu int, ktera se pouzije k nastaveni praveho
     *               scitance
     */
    public void setCislo2(int cislo2) {
        this.cislo2 = cislo2;
        this.soucetLong();
    }

    /**
     * Vypočítá součet dvou cisel typu int, ktera jsou ulozena v instanci a
     * uloží hodnotu dovnitřní promměné soucetLong.
     */
    private void soucetLong() {
        soucetLong = (long) cislo1 + cislo2;
    }

    /**
     * Vrací vnitřní aktuální stav součtu dvou císel typu int, které jsou uložena v instanci.
     *
     * @return Vraci vnitřní hodnotu typu long, ktera predstavuje soucet obou cisel
     * ulozenych v instanci.
     */
    public long getSoucetLong() {
        return soucetLong;
    }

    /**
     * Vraci znakovou reprezentaci instance, ktera popisuje jeji stav.
     *
     * @return Vraci objekt typu String, ktery obsahuje hodnoty obou scitanych
     * cisel a jejich součet. Priklad: "Scitacka{cislo1 = 23, cislo2 = 123, soucet = 146}".
     */
    @Override
    public String toString() {
        return "Scitacka{" + "cislo1 = " + cislo1 + ", cislo2 = " + cislo2 + ", soucetLong = " + soucetLong + "}";
    }

    /**
     * Testovaci metoda, ktera vytvori novou scitacku, kterou inicializuje
     * pomoci parametru levyScitanec a pravyScitenec. Potom vytiskne oba
     * scitance a jejich soucet.
     *
     * @param levyScitanec  levy scitanec
     * @param pravyScitanec pravy scitanec
     */
    public static void testScitacka(int levyScitanec, int pravyScitanec) {
        Scitacka scitacka = new Scitacka(levyScitanec, pravyScitanec);
        System.out.println(scitacka);
        int cislo1 = scitacka.getCislo1();
        int cislo2 = scitacka.getCislo2();
        long soucet = scitacka.getSoucetLong();
        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scitacka scitacka = new Scitacka();
        System.out.println(scitacka);

        scitacka.setCislo1ACislo2(1, 1);
        System.out.println(scitacka);

        scitacka.setCislo1(5);
        System.out.println(scitacka);

        scitacka.setCislo2(7);
        System.out.println(scitacka);

        scitacka.setCislo1(Integer.MAX_VALUE);
        System.out.println(scitacka);

        scitacka.setCislo2(Integer.MAX_VALUE);
        System.out.println(scitacka);

        scitacka.setCislo2(Integer.MIN_VALUE);
        System.out.println(scitacka);

/*
        testScitacka(0, 0);
//        Scitacka scitacka1 = new Scitacka();
//        System.out.println(scitacka);
//        int cislo1 = scitacka1.getCislo1();
//        int cislo2 = scitacka1.getCislo2();
//        int soucet = scitacka1.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka(5, 5);
//        Scitacka scitacka2 = new Scitacka(5);
//        System.out.println(scitacka);
//        cislo1 = scitacka2.getCislo1();
//        cislo2 = scitacka2.getCislo2();
//        soucet = scitacka2.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka(5, 10);
//        Scitacka scitacka3 = new Scitacka(5, 10);
//        System.out.println(scitacka);
//        cislo1 = scitacka3.getCislo1();
//        cislo2 = scitacka3.getCislo2();
//        soucet = scitacka3.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka(5, -10);
        testScitacka(Integer.MAX_VALUE, 1);
        testScitacka(Integer.MAX_VALUE, Integer.MAX_VALUE);
        testScitacka(Integer.MIN_VALUE, Integer.MIN_VALUE);
*/
    }
}
