package polecisel;

import java.util.Arrays;
import java.util.Random;

/**
 * Trida PoleCisel modeluje objekty, ktere v sobe zapouzdruji jednorozmerne pole
 * cisel typu int. Trida implementuje nektere zakladni algoritmy pro praci s
 * polem a rovnez nektere radici algoritmy.
 *
 * @author Jaroslav Icha
 * @version 05.02.2014, 28.02.2016
 */
public class PoleCisel {

    // staticka promenna, ktera se pouziva pro inicializaci instanci 
    private static Random rand = new Random();
    // instancni promenna, ktera uchovava pole cisel s prvky typu int
    private int[] poleCisel;

    /**
     * Konstruktor bez parametru, ktery provadi implicitni inicializaci v
     * zavislosti na tom, ktere radky jsou odkomentovany.
     */
    public PoleCisel() {
        // System.out.println(this);        
        //arrayOfNumbers = new int[10];
        // this.initialization(10);
        // initialization(10);
        poleCisel = new int[]{1, 2, 3, 4, 5};
        //         poleCisel = new int[] {};
    }

    /**
     * Konstruktor, ktery vytvari n prvkove pole cisel, jehoz prvky jsou
     * pseudonahodna cisla typu typu int z intervalu <1, m>.
     *
     * @param n pocet prvku pole
     * @param m urcuje horni mez intervalu pro hodnoty prvku pole
     */
    public PoleCisel(int n, int m) {
        poleCisel = new int[n];
        //this.inicializaceMath(m);
        this.inicializaceRand(m);
    }

    /**
     * Tato metoda inicializuje pole cisel tak, ze jeho prvky jsou pseudonahodna
     * cisla typu int z intervalu <1, m>. Pro inicializaci prvku je pouzita
     * staticka metoda random() ze tridy Math.
     */
    private void inicializaceMath(int m) {
        for (int i = 0; i < poleCisel.length; i++) {
            poleCisel[i] = (int) (Math.random() * m + 1);
        }
    }

    /**
     * Tato metoda inicializuje pole cisel tak, ze jeho prvky jsou pseudonahodna
     * cisla typu int z intervalu <1, m>. Pro inicializaci prvku je pouzita
     * instancni metoda nextInt(int n) ze tridy Random.
     *
     * @param m urcuje horni mez intervalu pro hodnoty prvku pole
     */
    private void inicializaceRand(int m) {
        for (int i = 0; i < poleCisel.length; i++) {
            poleCisel[i] = rand.nextInt(m) + 1;
        }
    }

    /**
     * Vraci soucet prvku v poli cisel.
     *
     * @return Vraci soucet prvku v poli cisel, ktere ma aspon jeden prvek.
     */
    public long soucetPrvku() {
        long soucetPrvku = poleCisel[0];
        for (int i = 1; i < poleCisel.length; i++) {
            soucetPrvku = soucetPrvku + poleCisel[i];
//            soucetPrvku += poleCisel[i];
        }
        return soucetPrvku;
    }

    /**
     * Vraci soucin prvku v poli cisel.
     *
     * @return Vraci soucin prvku v poli cisel, ktere ma aspon jeden prvek.
     */
    public long soucinPrvku() {
        long soucinPrvku = poleCisel[0];
        for (int i = 1; i < poleCisel.length; i++) {
            soucinPrvku = soucinPrvku * poleCisel[i];
//             soucinPrvku *= poleCisel[i];
        }
        return soucinPrvku;
    }

    /**
     * Vraci maximalni prvek v poli cisel.
     *
     * @return Vraci maximalni prvek v poli cisel, ktere ma aspon jeden prvek.
     */
    public int maximalniPrvek() {
        int maxPrvek = poleCisel[0];
        for (int i = 1; i < poleCisel.length; i++) {
            if (poleCisel[i] > maxPrvek) {
                maxPrvek = poleCisel[i];
            }
        }
        return maxPrvek;
    }

    /**
     * Vraci minimalni prvek v poli cisel.
     *
     * @return Vraci minimalni prvek v poli cisel, ktere ma aspon jeden prvek.
     */
    public int minimum() {
        // TODO add your code here 
        return 1;
    }

    /**
     * Vraci dvouprvkove pole, jehoz prvni prvek je minimum a druhy maximum v
     * poli poleCisel.
     */
    public int[] minimax() {
        // TODO add your code here 
        return new int[]{1, 1};
    }

    /**
     * Seradi pole poleCisel vzestupne s vyuzitim staticke metody sort ze tridy
     * Arrays.
     */
    public void sort() {
        Arrays.sort(poleCisel);
    }

    /**
     * Seradi pole poleCisel vzestupne s vyuzitim algoritmu SelectionSort.
     */
    public void selectionSort() {
        int indexMin;
        int n = poleCisel.length;
        for (int i = 0; i <= n - 2; i++) {
            // vypocet indexu minimalniho prvku v poleCisel[i .. n - 1]
            indexMin = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (poleCisel[j] < poleCisel[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = poleCisel[i];
            poleCisel[i] = poleCisel[indexMin];
            poleCisel[indexMin] = temp;
        }
    }

    /**
     * Seradi pole poleCisel vzestupne s vyuzitim algoritmu SelectionSort.
     * Modifikace spocivajici v tom, ze se pocita nejen pozice minima v
     * poleCisel[i .. n - 1], ale tez hodnota minimalniho prvku.
     */
    public void selectionSortModif() {
        int indexMin;
        int minElement;
        int n = poleCisel.length;
        for (int i = 0; i <= n - 2; i++) {
            // vypocet indexu a hodnoty minimalniho prvku v poleCisel[i .. n - 1]
            indexMin = i;
            minElement = poleCisel[i];
            for (int j = i + 1; j <= n - 1; j++) {
                if (poleCisel[j] < minElement) {
                    indexMin = j;
                    minElement = poleCisel[j];
                }
            }
            poleCisel[indexMin] = poleCisel[i];
            poleCisel[i] = minElement;
        }
    }

    /**
     * Seradi pole poleCisel vzestupne s vyuzitim algoritmu InsertionSort.
     */
    public void insertionSort() {
        int n = poleCisel.length - 1;
        for (int i = 1; i <= n; i++) {
            int insertedItem = poleCisel[i];
            // vlozeni prvku poleCisel[i] do serazeneho useku poleCisel[0..i - 1]
            int j = i - 1;
            while (j >= 0 && insertedItem < poleCisel[j]) {
                poleCisel[j + 1] = poleCisel[j];
                j--;
            }
            poleCisel[j + 1] = insertedItem;
        }
    }

    /**
     * Seradi pole poleCisel vzestupne s vyuzitim algoritmu BubbleSort.
     */
    public void bubbleSort() {
        // TODO add your code here 
    }

    /**
     * Seradi usek poleCisel[left .. right] z poleCisel s vyuzitim algoritmu
     * MergeSort.
     *
     * @param left index leveho krajniho prvku v useku poleCisel[left .. right]
     * @param right index praveho krajniho prvku v useku poleCisel[left ..
     * right]
     */
    public void mergeSort(int left, int right) {
        int n = right - left + 1;  // pocet razenych cisel
        if (n <= 1) {
            return;
        } else {
            int center = left + (right - left) / 2;
            mergeSort(left, center); //rekurzivni volani metody mergesort
            mergeSort(center + 1, right); //rekurzivni volani metody mergesort
            merge(left, center, right); //slouceni dvou serazenych useku
            //metodou merge(int left, int center, int right)
        }
    }

    /**
     * Slouci dva serazene useky poleCisel[left .. center] a poleCisel[center +
     * 1 .. right] tak, ze cely usek poleCisel[left .. right] bude vzestupne
     * serazen.
     *
     * @param left index leveho krajniho prvku v useku poleCisel[left .. right]
     * @param center index prostredniho prvku v useku poleCisel[left .. right]
     * @param right index praveho krajniho prvku v useku poleCisel[left ..
     * right]
     */
    private void merge(int left, int center, int right) {
        int n = right - left + 1;
        int k = 0;
        int[] helper = new int[n];
        int i = left;
        int j = center + 1;
        while (i <= center && j <= right) {
            if (poleCisel[i] <= poleCisel[j]) {
                helper[k] = poleCisel[i];
                i++;
            } else {
                helper[k] = poleCisel[j];
                j++;
            }
            k++;
        }
        // kopirovani zbyvajicich prvku z leveho useku
        while (i <= center) {
            helper[k] = poleCisel[i];
            i++;
            k++;
        }

        // kopirovani zbyvajicich prvku z praveho useku
        while (j <= right) {
            helper[k] = poleCisel[j];
            j++;
            k++;
        }
        //kopirovani  prvku z pomocneho pole do poleCisel
        for (k = 0; k < n; k++) {
            poleCisel[left + k] = helper[k];
        }
    }

    /**
     * Vypise pole poleCisel. Kazdy prvek se vypisuje na novy radek.
     */
    public void printArrayOfNumbers() {
        for (int i = 0; i < poleCisel.length; i++) {
            System.out.println("A[ " + i + " ]  = " + poleCisel[i]);
        }
    }

    /**
     * Vraci znakovou reprezentaci instance.
     *
     * @return Vraci znakovou reprezentaci instance v nasledujicim formatu.
     * napr.: "polecisel.PoleCisel( 1, 5, 8 )" v pripade, ze poleCisel obsahuje
     * tri prvky 1, 5, 8.
     */
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(this.getClass().getName());
        result.append("( ");
        for (int i = 0; i < poleCisel.length - 1; i++) {
            result.append(poleCisel[i]);
            result.append(", ");
        }
        result.append(poleCisel[poleCisel.length - 1]);
        result.append(" )");
        return result.toString();
    }

    public static void testMergeSort() {
        for (int i = 0; i < 3; i++) {
            PoleCisel novePole = new PoleCisel(20, 100);
            System.out.println("pole pred razenim metodou mergesort");
            System.out.println("" + novePole);
            novePole.mergeSort(0, 19);
            System.out.println("pole po razeni metodou mergesort");
            System.out.println("" + novePole);
            System.out.println("");
        }
    }

    /**
     * Vraci true prave kdyz prvky poleCisel tvori neklesajici posloupnost,
     * jinak vraci false.
     * @return Vraci true prave kdyz prvky poleCisel tvori neklesajici posloupnost,
     * jinak vraci false.
     */
    private boolean kontrolaRazeni() {
        for (int i = 0; i < poleCisel.length - 1; i++) {
            if (poleCisel[i] > poleCisel[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static boolean testMergeSort(int pocetPrvku, int rozsah) {
        PoleCisel novePole = new PoleCisel(pocetPrvku, rozsah);
        novePole.mergeSort(0, pocetPrvku - 1);        
        return novePole.kontrolaRazeni();
    }

    public static void testSoucinPrvku() {
        PoleCisel novePole = new PoleCisel();
        System.out.println("Kontrola vypoctu soucinu prvku v poli");
        System.out.println(novePole);
        System.out.println("Soucin prvku = " + novePole.soucinPrvku());
    }

    public static void main(String[] args) {
        testMergeSort();
        System.out.println("Test MergeSort: Kontrola razeni 1000 000 prvku: " + testMergeSort(1000000, 1000000));
        System.out.println("");
        testSoucinPrvku();
    }

}
