import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int year,bol,bol2,bol3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();
        bol = year%100;
        bol2=year%400;
        bol3=year%4;
        if (bol==0&&bol2==0){
                System.out.println(year+ " Bir Artık Yıldır.");
        }else if (bol>0&&bol3==0){
            System.out.println(year+" Bir Artık Yıldır");
        }else{
            System.out.println(year+" Artık Yıl Değildir");
        }



    }

}
