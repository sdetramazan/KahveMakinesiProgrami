package Package;

import java.util.Scanner;

public class Proje {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kahve Çeşitleri : ");
        System.out.println("1 - Türk Kahvesi");
        System.out.println("2 - Filtre Kahve");
        System.out.println("3 - Espresso");
        System.out.print("Hangi Kahveyi istersiniz(1-3) : ");

        String kahve ="";
        int kahveSecimi=0;

        while (kahveSecimi<1 || kahveSecimi>3){

            kahveSecimi=input.nextInt();
            switch (kahveSecimi){
                case 1: kahve="Türk Kahvesi"; System.out.println(kahve+" hazırlanıyor...");break;
                case 2: kahve="Filtre Kahve"; System.out.println(kahve+" hazırlanıyor...");break;
                case 3: kahve="Espresso"; System.out.println(kahve+" hazırlanıyor...");break;
                default:
                    System.out.print("Hatalı giriş yapıldı. Lütfen Tekrar Seçim Yapın :");
            }
        }
        input.nextLine();
        System.out.print("Süt eklememizi ister misiniz (Evet/Hayır) : ");
        String sutSecimi=input.nextLine();
        boolean sut = sutSecimi.equalsIgnoreCase("Evet");
        if (sut){
            System.out.println(kahve+" Sütlü hazırlanıyor...");
        }else {
            System.out.println(kahve+" Sütsüz hazırlanıyor...");
        }
        System.out.print("Şeker eklemek ister misiniz(Evet/Hayır): ");
        String sekerSecimi=input.nextLine();
        boolean seker =sekerSecimi.equalsIgnoreCase("Evet");


       if (sekerSecimi.equalsIgnoreCase("Evet")){

            System.out.print("Kaç Adet Şeker İstersiniz:");
          // input.nextInt();
            int sekerMiktari=input.nextInt();
            System.out.println(sekerMiktari+" adet şeker eklenerek "+kahve+" hazırlanıyor...");
        } else {
            System.out.println("Şekersiz hazırlanıyor.");
        }


        }

    }

