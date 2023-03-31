import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zar1;
        int zar2;
        int zar1ad;
        int zar2ad;
        int victoriileMele = 0;
        int victoriiAd = 0;

        Scanner cititor = new Scanner(System.in);
        Random generator = new Random();

        while (true) {
            System.out.println("Doriti sa jucati? DA/NU");  //se asteapta raspunsul utilizatorului
            String raspuns = cititor.nextLine();
            if (raspuns.equalsIgnoreCase("Nu")) {   //in cazul in care este negativ, se iese din aplicatie
                System.out.println("Va mai asteptam pe la noi!");
                break;
            } else if (raspuns.equalsIgnoreCase("Da")) { //daca este afirmativ, continuam aplicatia
                zar1 = generator.nextInt(6) + 1;            //se arunca primul zar al utilizatorului
                zar2 = generator.nextInt(6) + 1;            //se arunca pal doilea zar al utilizatorului
                zar1ad = generator.nextInt(6) + 1;          //se arunca primul zar al adversarului
                zar2ad = generator.nextInt(6) + 1;          //se arunca al doilea zar al adversarului
                System.out.println("Ati dat " + zar1 + " si " + zar2); //se arata zarulire utilizatorului
                System.out.println("Adversarul a dat " + zar1ad + " si " + zar2ad);//se arata zarurile adversarului

                int scorulMeu = zar1 + zar2; //se calculeaza scorul utilizatorului
                int scorAd = zar1ad + zar2ad; //se calculeaza scorul adversarului
                if (scorAd > scorulMeu) { //daca scorul adversarului este mai mare decat scorul nostru, atunci am pierdut
                    System.out.println("Adversarul a castigat runda!");
                    victoriiAd++;
                } else if (scorulMeu > scorAd) { ///daca scorul adversarului este mai mic decat scorul nostru, atunci am castigat
                    System.out.println("Ati castigat runda!");
                    victoriileMele++;
                } else {
                    System.out.println("Remiza!");// daca scorurile sunt egale, atunci este remiza
                }
                if (victoriileMele == 6) {  //daca numarul victoriilor utilizatorului este 6, atunci am castigat
                    System.out.println("Ati castigat partida!");
                    break;
                } else if (victoriiAd == 6) {  //daca numarul victoriilor adversarului este 6, atunci a castigat
                    System.out.println("Adversarul a castigat partida!");
                    break;
                }
            } else {
                System.out.println("Nu ati introdus un raspuns valid!"); //se asteapta sa se introduca un raspun valid
            }

        }

    }
}