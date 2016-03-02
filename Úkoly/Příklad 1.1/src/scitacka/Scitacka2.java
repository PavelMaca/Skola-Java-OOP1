package Scitacka2;

/**
 * Created by Pavel on 22.2.2016.
 */

/**
 * Trida Scitacka2 predstavuje model scitacky, ktera pouze umi secist dve cela
 * cisla typu int. Kazda instance teto tridy uchovava dve cela cisla typu int,
 * ktera se daji menit a je mozne kdykoliv urcit jejich soucet pomoci zavolani
 * metody soucet().
 *
 * @author Jaroslav Icha
 * @version 15.2.2016
 */
public class Scitacka2 {

    // instancni promenne, ktere uchovavaji dve cisla, ktera se budou scitat
    private int cislo1;
    private int cislo2;
    private long oboje;



    /**
     * Konstruktor pro objekty tridy Scitacka2, ktery nastavi hodnoty obou
     * scitanych cisel na hodnoty dane parametry cislo1 a cislo2.
     *
     * @param cislo1 levy scitanec
     * @param cislo2 pravy scitanec
     */
    public Scitacka2(int cislo1, int cislo2) {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
        this.soucet();
    }

    /**
     * Konstruktor pro objekty tridy Scitacka2, ktery nastavi hodnoty obou
     * scitanych cisel na nulu.
     */
    public Scitacka2() {
        cislo1 = 0;
        cislo2 = 0;

        //this(0, 0);
    }

    /**
     * Konstruktor pro objekty tridy Scitacka2, ktery nastavi hodnoty obou
     * scitanych cisel na hodnotu danou parametrem cislo.
     *
     * @param cislo spolecna hodnota obou scitancu
     */
    public Scitacka2(int cislo) {
        this.cislo1 = cislo;
        this.cislo2 = cislo;
        soucet();
        //this(cislo, cislo);
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
     * Metoda nastavi hodnotu leveho scitance pomoci parametru cislo1.
     *
     * @param cislo1 hodnota typu int, ktera se pouzije k nastaveni leveho
     * scitance
     */
    public void setCislo1(int cislo1) {
        this.cislo1 = cislo1;
        soucet();
    }

    /**
     * Metoda nastavi hodnotu leveho a praveho scitance pomoci parametru cislo1
     * a cislo2.
     *
     * @param cislo1 hodnota typu int, ktera se pouzije k nastaveni leveho
     * scitance
     * @param cislo2 hodnota typu int, ktera se pouzije k nastaveni praveho
     * scitance
     */
    public void setCislo1ACislo2(int cislo1, int cislo2) {
        this.cislo1 = cislo1;
        this.cislo2 = cislo2;
        this.soucet();

        //setCislo1(cislo1);
        //setCislo2(cislo2);
    }

    /**
     * Metoda nastavi hodnotu praveho scitance pomoci parametru cislo2.
     *
     * @param cislo2 hodnota typu int, ktera se pouzije k nastaveni praveho
     * scitance
     */
    public void setCislo2(int cislo2) {
        this.cislo2 = cislo2;
        soucet();
    }

    /**
     * Vraci soucet dvou cisel typu int, ktera jsou ulozena v instanci.
     *
     * @return Vraci hodnotu typu int, ktera predstavuje soucet obou cisel
     * ulozenych v instanci. V pripade preteceni neni vyhozena zadna vyjimka a
     * metoda vraci chybny vysledek.
     */

//    public int oboje() {
//
//        return cislo1 + cislo2;

//    }
    private void soucet() {
        oboje = (long) cislo1+cislo2;
    }

    /**
     * Vraci soucet dvou cisel typu int, ktera jsou ulozena v instanci.
     *
     * @return Vraci hodnotu typu long, ktera predstavuje soucet obou cisel
     * ulozenych v instanci.
     */
    public long soucetLong() {
        return (long) oboje;
    }

    /**
     * Vraci soucet dvou cisel typu int, ktera jsou ulozena v instanci.
     *
     * @return Vraci hodnotu typu long, ktera predstavuje soucet obou cisel
     * ulozenych v instanci. Porovnejte s metodou soucetLong().
     */
    public long getOboje() {
        return  oboje;
    }

    /**
     * Vraci znakovou reprezentaci instance, ktera popisuje jeji stav.
     *
     * @return Vraci objekt typu String, ktery obsahuje hodnoty obou scitanych
     * cisel. Priklad: "Scitacka2{cislo1 = 23, cislo2 = 123}".
     */
    @Override
    public String toString() {
        return "Scitacka2{" + "cislo1 = " + cislo1 + ", cislo2 = " + cislo2 + "}";
    }

    /**
     * Testovaci metoda, ktera vytvori novou scitacku, kterou inicializuje
     * pomoci parametru levyScitanec a pravyScitenec. Potom vytiskne oba
     * scitance a jejich soucet.
     *
     * @param levyScitanec levy scitanec
     * @param pravyScitanec pravy scitanec
     */
    public static void testScitacka2(int levyScitanec, int pravyScitanec) {
        Scitacka2 Scitacka2 = new Scitacka2(levyScitanec, pravyScitanec);
        System.out.println(Scitacka2);
        int cislo1 = Scitacka2.getCislo1();
        int cislo2 = Scitacka2.getCislo2();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + Scitacka2.soucet());
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + Scitacka2.soucetLong());
        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + Scitacka2.getOboje());
        System.out.println();
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testScitacka2(0, 0);
//        Scitacka2 Scitacka21 = new Scitacka2();
//        System.out.println(Scitacka2);
//        int cislo1 = Scitacka21.getCislo1();
//        int cislo2 = Scitacka21.getCislo2();
//        int soucet = Scitacka21.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka2(5, 5);
//        Scitacka2 Scitacka22 = new Scitacka2(5);
//        System.out.println(Scitacka2);
//        cislo1 = Scitacka22.getCislo1();
//        cislo2 = Scitacka22.getCislo2();
//        soucet = Scitacka22.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka2(5, 10);
//        Scitacka2 Scitacka23 = new Scitacka2(5, 10);
//        System.out.println(Scitacka2);
//        cislo1 = Scitacka23.getCislo1();
//        cislo2 = Scitacka23.getCislo2();
//        soucet = Scitacka23.soucet();
//        System.out.println("součet čísel " + cislo1 + " a " + cislo2 + " = " + soucet);

        testScitacka2(5, -10);
        testScitacka2(Integer.MAX_VALUE, 1);
        testScitacka2(Integer.MAX_VALUE, Integer.MAX_VALUE);
        testScitacka2(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}