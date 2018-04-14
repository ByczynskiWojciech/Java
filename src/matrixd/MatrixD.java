/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixd;

import java.util.Arrays;

public class MatrixD {

    /**
     * Prosty kalkulator dla macierzy, działa dla macierzy o dowolnej długości, jeżeli rozmiar jest zły wypisuję komunikat
     */
    public static void main(String[] args) {

        double liczba = 1.0;
        int numWier = 1;
        int numKol = 1;

        // Parę macierzy sprawdzających działanie funkcji
        //macierz pierwsza o 3 kolumanch i 3 wierszach, macierz druga o 3 wierszach i 3 kolumnach
//        double macierz[][] = {{1.0, 2.0, 3.5}, {3.0, 4.0, 5.1}, {3.0, 5.7, 2.1}};
//        double macierz2[][] = {{2.0, 4.3, 2.2}, {2.1, 5.1, 2.2}, {5.1, 3.2, 6.8}};
        //macierz pierwsza o 3 kolumanch i 2 wierszach, macierz druga o 3 wierszach i 3 kolumnach
//        double macierz[][] = {{1.0,2.0,3.5},{3.0,4.0,5.1}};
//        double macierz2[][] = {{2.0,4.3,2.2},{2.1,5.1,2.2},{5.1,3.2,6.8}};
        //macierz kwadratowa jedna i druga
//        double macierz[][] = {{5.0, 2.0}, {6.0, 4.0}};
//        double macierz2[][] = {{2.0, 4.3}, {2.1, 5.1}};
        //macierz pierwsza o 3 kolumnach i 2 wierszach, macierz druga o 2 wierszach i 3 kolumnach
//        double macierz[][] = {{1.0,2.0},{3.0,4.0},{5.0,6.0}};
//        double macierz2[][] = {{8.0,2.0,5.0},{4.0,5.0,1.0}};
        //macierz pierwsza o 2 kolumnach i 3 wierszach, macierz druga o 3 wierszach i 2 kolumnach
//        double macierz[][] = {{1.0,2.0},{3.0,4.0},{5.0,6.0}};
//        double macierz2[][] = {{8.0,2.0,5.0},{4.0,5.0,1.0}};
        //macierz pierwsza o 4 kolumnach i 4 wierszach, macierz druga o 4 wierszach i 4 kolumnach
//        double macierz[][] = {{3.0,2.0,5.6,2.4},{1.0,4.2,5.8,7.4},{4.1,9.5,3.3,6.2},{1.0,9.1,7.2,4.4}};
//        double macierz2[][] = {{1.1,5.3,2.2,3.2},{7.1,5.1,5.6,3.4},{8.1,9.2,1.6,7.4},{8.5,8.1,5.5,1.1}};
        //macierz pierwsza o 7 kolumnach i 7 wierszach, macierz druga o 7 wierszach i 7 kolumnach
        double macierz[][] = {{3.0, 2.0, 5.6, 2.4, 5.6, 5.5, 3.4}, {1.0, 4.2, 5.8, 7.4, 7.2, 4.5, 6.3}, {4.1, 9.5, 3.3, 6.2, 7.3, 8.8, 9.0}, {1.0, 9.1, 7.2, 4.4, 3.3, 6.6, 8.7}, {1.1, 5.3, 2.2, 3.2, 4.0, 3.0, 5.1}, {7.1, 5.1, 5.6, 3.4, 9.9, 7.0, 3.3}, {8.1, 9.2, 1.6, 7.4, 3.3, 6.6, 2.2}};
        double macierz2[][] = {{1.1, 5.3, 2.2, 3.2, 4.0, 3.0, 5.1}, {7.1, 5.1, 5.6, 3.4, 9.9, 7.0, 3.3}, {8.1, 9.2, 1.6, 7.4, 3.3, 6.6, 2.2}, {8.5, 8.1, 5.5, 1.1, 1.1, 6.9, 4.2}, {3.0, 2.0, 5.6, 2.4, 5.6, 5.5, 3.4}, {1.0, 4.2, 5.8, 7.4, 7.2, 4.5, 6.3}, {4.1, 9.5, 3.3, 6.2, 7.3, 8.8, 9.0}};
//        System.out.println(macierz.length);//wiersz
//        System.out.println(macierz[0].length);//kolumna
//        System.out.println(macierz2.length);//wiersz
//        System.out.println(macierz2[0].length);//kolumna
        double pomMacierz[][] = new double[macierz.length][macierz[0].length];
        double pomMacierz2[][] = new double[macierz2.length][macierz2[0].length];

        //if ten sprawdza czy macierze sa tego samego rozmiaru i jeżeli nie są wypisuję błąd, że nie można dodać macierzy.
        if ((macierz.length == macierz2.length) && (macierz[0].length == macierz2[0].length)) {
            System.out.println("Suma dla macierzy wynosi = " + Arrays.deepToString(suma(macierz, macierz2)));
        } else {
            System.out.println("Suma miecierzy nie istnieje poniewaz maja rozne rozmiary!");
        }

        //if ten sprawdza czy macierze sa tego samego rozmiary jeżeli nie to wypisuję błąd, że nie można odjąć macierzy 
        macminus(pomMacierz2, macierz2); // przepisuję macierz do pomocniczej zmieniając jej wartości na przeciwne

        if ((macierz.length == macierz2.length) && (macierz[0].length == macierz2[0].length)) {
            System.out.println("Roznica dla macierzy wynosi = " + Arrays.deepToString(suma(macierz, pomMacierz2)));
        } else {
            System.out.println("Rożnica miecierzy nie istnieje poniewaz maja rozne rozmiary!");
        }

        //if ten sprawdza czy macierz jest mozliwa do pomnozenia, jezeli tak to puszcza ja przez funkcje mnozaca
        if ((macierz[0].length == macierz2.length)) {
            System.out.println("Suma mnozenia macierzy wynosi = " + Arrays.deepToString(mnozMacierzy(macierz, macierz2)));
        } else {
            System.out.println("Macierzy nie da się pomnozyc!");
        }

        System.out.println("Macierz po transpozycji : " + Arrays.deepToString(trans(true, macierz)));

        if (numWier <= macierz.length) {
            System.out.println("Suma dla wiersza pierwszej macierzy wynosi = " + sumWier(numWier, macierz));
        } else {
            System.out.println("Podany numer wiersza jest poza zakresem macierzy!");
        }

        if (numKol <= macierz[0].length) {
            System.out.println("Suma dla kolumny pierwszej macierzy wynosi = " + sumKol(numKol, macierz));
        } else {
            System.out.println("Podany numer kolumny jest poza zakresem macierzy!");
        }

        System.out.println("Suma wszystkich elementów dla pierwszej macierzy = " + sumaElma(macierz));

        System.out.println("Macierz1 = " + Arrays.deepToString(macierz));
        System.out.println("Macierz2 = " + Arrays.deepToString(macierz2));
        System.out.println("Macierz pomocznicza = " + Arrays.deepToString(pomMacierz));
        System.out.println("Macierz pomocznicza = " + Arrays.deepToString(pomMacierz2));

        //Mnozenie macierzy przez liczbe
        System.out.println("Mnozenie macierzy przez liczbe :" + Arrays.deepToString(mnozLicz(liczba, macierz)));

        //Potegowanie macierzy
        if (macierz.length == macierz[0].length) {
            System.out.println("Potęga dla macierzy wynosi = " + Arrays.deepToString(potMacierzy(liczba, macierz)));
        } else {
            System.out.println("Nie da się spotęgować macierzy ponieważ macierz nie jest kwadratowa!");
        }

        if (macierz.length == macierz[0].length) {
            if (macierz.length == 1) {
                System.out.println("Wyznacznik macierzy wynosi tyle ile jej jedyna wartość czyli :" + macierz[0][0]);
            } else if (macierz.length == 2) {
                System.out.println("Macierz jest o rozmiarze 2x2 jej wyznacznik wynosi :" + wyzMacierzy(macierz));
            } else if (macierz.length == 3) {
                System.out.println("Macierz jest o rozmiarze 3x3 jej wyznacznik wynosi :" + wyzMacierzy(macierz));
            } else if (macierz.length >= 4) {
                System.out.println("Macierz jest o rozmiarze " + macierz.length + "x" + macierz[0].length + " i jej wyznacznik wynosi :" + wyzMacierzy(macierz));
            } else {
                System.out.println("Wychodzi poza if wtf?");
                System.out.println("Woitóź gej XDDDD");
            }
        } else {
            System.out.println("Macierz nie jest kwadratowa!");
        }

        if (macierz.length == macierz[0].length) {
            System.out.println("Macierz dopełnien wyglada tak :" + Arrays.deepToString(macierzDopelnien(true, macierz)));
        } else {
            System.out.println("Macierz nie jest kwadratowa!");
        }

        if (macierz.length == macierz[0].length) {
            System.out.println("Odwrotna wynosi wyglada tak :" + Arrays.deepToString(macierzOdwrotna(macierz)));
        } else {
            System.out.println("Macierz nie jest kwadratowa!");
        }
    }

    // Suma macierzy
    private static double[][] suma(double macierz[][], double macierz2[][]) {

        double pom_macierz[][] = new double[macierz.length][macierz[0].length];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                pom_macierz[i][j] = macierz[i][j] + macierz2[i][j];
            }
        }
        
        //System.out.println(macierz[1][2]+macierz2[1][2]);
        return pom_macierz;
    }

    // Mnożenie macierzy
    private static double[][] mnozMacierzy(double macierz[][], double macierz2[][]) {

        double pom_macierz[][] = new double[macierz.length][macierz2[0].length];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz2[0].length; j++) {
                double suma = 0;
                for (int k = 0; k < macierz[0].length; k++) {
                    suma = suma + (macierz[i][k] * macierz2[k][j]);
                }
                pom_macierz[i][j] = suma;
                suma = 0;
            }
        }
        return pom_macierz;
    }

    // Funkcja ta przyjmuje macierz i zwraca macierz transponowana 
    private static double[][] trans(boolean czy_zwraca, double macierz[][]) {

        double pom_macierz[][] = new double[macierz[0].length][macierz.length];
        if (czy_zwraca == true) {

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    pom_macierz[j][i] = macierz[i][j];
                }
            }
        } else {

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    pom_macierz[j][i] = macierz[i][j];
                }
            }

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    macierz[i][j] = pom_macierz[i][j];
                }
            }
        }
        return pom_macierz;
    }

    // Metoda ta przyjmuje macierz i numer wiersza który ma zsumować i zwraca sumę tego wiersza
    private static double sumWier(int numWier, double macierz[][]) {

        double suma = 0;

        for (int i = 0; i < macierz[0].length; i++) {
            suma = suma + macierz[numWier][i];
        }
        return suma;
    }

    // Metoda ta przyjmuje macierz i numer kolumny i liczy sume w tej kolumnie oraj ja zwraca
    private static double sumKol(int numKol, double macierz[][]) {

        double suma = 0;

        for (double[] macierz1 : macierz) {
            suma = suma + macierz1[numKol];
        }
        return suma;
    }

    // Metoda ta przyjmuje macierz i liczy sume jej wszystkich elementow oraz ja zwraca
    private static double sumaElma(double macierz[][]) {

        double suma = 0;

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                suma = suma + macierz[i][j];
            }
        }
        return suma;
    }

    private static void macminus(double pomacierz[][], double macierz[][]) {

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                pomacierz[i][j] = -(macierz[i][j]);
            }
        }
    }

    private static double[][] mnozLicz(double liczba, double macierz[][]) {

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = (double) liczba * macierz[i][j];
            }
        }
        return macierz;
    }

    // zwraca potęge macierzy
    private static double[][] potMacierzy(double liczba, double macierz[][]) {

        double pom_macierz[][] = new double[macierz.length][macierz[0].length];

        for (int g = 0; g < liczba; g++) {
            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    double suma = 0;
                    for (int k = 0; k < macierz[0].length; k++) {
                        suma = suma + (macierz[i][k] * macierz[k][j]);
                    }
                    pom_macierz[i][j] = suma;
                    suma = 0;
                }
            }
        }
        return pom_macierz;
    }

    // zwraca wyznacznik macierzy 2x2 lub 3x3 
    private static double wyzMacierzy(double macierz[][]) {
        double pomMacierz[][] = new double[macierz.length - 1][macierz[0].length - 1];
        double wyznacznik = 0.0;
        double drugaMacierz = 0.0;
        double znak = 0;
        int modulo = 0;
        int x = 0, y = 0;
        int h = 0, t = 0;

        if (macierz.length == 1) {
            wyznacznik = macierz[0][0];
        } else if (macierz.length == 2) {
            wyznacznik = ((macierz[0][0] * macierz[1][1]) - (macierz[0][1] * macierz[1][0]));
        } else if (macierz.length == 3) {
            wyznacznik = ((macierz[0][0] * macierz[1][1] * macierz[2][2]) + (macierz[1][0] * macierz[2][1] * macierz[0][2]) + (macierz[2][0] * macierz[0][1] * macierz[1][2]) - (macierz[0][2] * macierz[1][1] * macierz[2][0]) - (macierz[1][2] * macierz[2][1] * macierz[0][0]) - (macierz[2][2] * macierz[0][1] * macierz[1][0]));
        } else {
            for (int i = 0; i < macierz[0].length; i++) {
                y = i;
                modulo = mod(x, y);

                h = 0;
                t = 0;
                for (int k = 0; k < macierz.length; k++) {
                    for (int l = 0; l < macierz.length; l++) {
                        if (k != 0 && l != i) {
                            pomMacierz[h][t] = macierz[k][l];

                            if (pomMacierz[h][t] != 0 && t != (pomMacierz.length - 1)) {
                                t++;
                            } else if ((pomMacierz[h][t] != 0) && (t == (pomMacierz.length - 1))) {
                                h++;
                                t = 0;
                            }
                        }
                    }
                }
                if (mod(x, y) == 0) {
                    znak = 1;
                } else {
                    znak = -1;
                }
                drugaMacierz = znak * macierz[0][i] * wyzMacierzy(pomMacierz);
                wyznacznik = wyznacznik + drugaMacierz;

            }
        }

        return wyznacznik; 
    }

    private static double[][] macierzDopelnien(boolean czy_zwraca, double macierz[][]) {
        double dopelMacierz[][] = new double[macierz.length][macierz[0].length];
        double pomMacierz[][] = new double[macierz.length - 1][macierz[0].length - 1];
        int modulo = 0;
        if (czy_zwraca == true) {
            int h = 0, t = 0;
            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz.length; j++) {
                    h = 0;
                    t = 0;
                    for (int k = 0; k < macierz.length; k++) {
                        for (int l = 0; l < macierz.length; l++) {
                            if (k != i && l != j) {
                                pomMacierz[h][t] = macierz[k][l];

                                if (pomMacierz[h][t] != 0 && t != (pomMacierz.length - 1)) {
                                    t++;
                                } else if ((pomMacierz[h][t] != 0) && (t == (pomMacierz.length - 1))) {
                                    h++;
                                    t = 0;
                                }
                            }
                        }
                    }
                    modulo = mod(i, j);
                    if (modulo == 0) {
                        dopelMacierz[i][j] = wyzMacierzy(pomMacierz);
                    } else {
                        dopelMacierz[i][j] = -(wyzMacierzy(pomMacierz));
                    }

                }
            }

        } else {
            int h = 0, t = 0;
            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz.length; j++) {
                    h = 0;
                    t = 0;
                    for (int k = 0; k < macierz.length; k++) {
                        for (int l = 0; l < macierz.length; l++) {
                            if (k != i && l != j) {
                                pomMacierz[h][t] = macierz[k][l];

                                if (pomMacierz[h][t] != 0 && t != (pomMacierz.length - 1)) {
                                    t++;
                                } else if ((pomMacierz[h][t] != 0) && (t == (pomMacierz.length - 1))) {
                                    h++;
                                    t = 0;
                                }
                            }
                        }
                    }
                    modulo = mod(i, j);
                    if (modulo == 0) {
                        dopelMacierz[i][j] = wyzMacierzy(pomMacierz);
                    } else {
                        dopelMacierz[i][j] = -(wyzMacierzy(pomMacierz));
                    }
                }
            }

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[0].length; j++) {
                    macierz[i][j] = dopelMacierz[i][j];
                }
            }

        }
        return dopelMacierz;
    }

    private static double[][] macierzOdwrotna(double macierz[][]) {
        double macierzOdw[][] = new double[macierz.length][macierz.length];
        double wyznacznik = 0;

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                macierzOdw[i][j] = macierz[i][j];
            }
        }
        wyznacznik = 1 / wyzMacierzy(macierz); // wyznacznik jest w postaci 1 / wyznacznik
        macierzDopelnien(false, macierzOdw);
        trans(false, macierzOdw);

        mnozLicz(wyznacznik, macierzOdw);

        return macierzOdw;
    }

    private static int mod(int i, int j) {
        int result = (i + j) % 2;

        return result;
    }
}
