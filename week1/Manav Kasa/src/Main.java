/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Manav kasa programı");
        System.out.println("___________________");

        // Determining the variables.
        double armutkg, elmakg, domatkg, muzkg, patlicankg, fiyat;

        // Giriş verileri;
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Armut kg: ");
            armutkg = input.nextDouble();
                do {
                    if (armutkg < 0 ){
                        System.out.println("Olmaz ki");
                        System.out.println("Armut kg: ");
                        armutkg = input.nextDouble();
                    }else {
                        break;
                    }
                }while (armutkg < 0);

                System.out.println("Elma kg: ");
                elmakg = input.nextDouble();
                do {
                    if (elmakg < 0 ){
                        System.out.println("Olmaz ki");
                        System.out.println("Elma kg: ");
                        elmakg = input.nextDouble();
                    }else {
                        break;
                    }
                }while (elmakg < 0);

                System.out.println("Domates kg: ");
                domatkg = input.nextDouble();
                do {
                    if (domatkg < 0 ){
                        System.out.println("Olmaz ki");
                        System.out.println("Domates kg: ");
                        domatkg = input.nextDouble();
                    }else {
                        break;
                    }
                }while (domatkg < 0);

                System.out.println("Muz kg: ");
                muzkg = input.nextDouble();
                do {
                    if (muzkg < 0 ){
                        System.out.println("Olmaz ki");
                        System.out.println("Muz kg: ");
                        muzkg = input.nextDouble();
                    }else {
                        break;
                    }
                }while (muzkg < 0);

                System.out.println("Patlıcan kg: ");
                patlicankg = input.nextDouble();
                do {
                    if (patlicankg < 0 ){
                        System.out.println("Olmaz ki");
                        System.out.println("Patlıcan kg: ");
                        patlicankg = input.nextDouble();
                    }else {
                        break;
                    }
                }while (patlicankg < 0);

                // Çıkış verisi ve hesaplama;
            fiyat = (armutkg*2.14) + (elmakg*3.67) + (domatkg*1.11) + (muzkg*0.95) + (patlicankg*5.0);
            System.out.println("Total fiyat: " + fiyat + " TL");
            break;

        }
    }
}

