package patika;

import java.util.Scanner;

public class Hava_sicakligine_gore_etk {
    public static void main(String[] args) {
        int heat;
        Scanner sc=new Scanner(System.in);
        System.out.println("sıcaklık değerini giriniz:");
        heat=sc.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat>=5&&heat<=25) {
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if(heat>=10){
                System.out.println("Piknik yapabilirsiniz");
            }

        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
