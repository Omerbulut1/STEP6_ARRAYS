package STEP6_ARRAYS;
import java.util.Scanner;

public class A4_ARRAYS_Big_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int miktar,BNumber, SNumber, array1[];
        System.out.println("kac adet sayi gireceksiniz");
        miktar=input.nextInt();
        array1=new int[miktar];

        while(miktar<=0){
            System.out.println("gecerli bir miktar giriniz");
            miktar=input.nextInt();
        }
        for (int i=0;i<miktar;i++){
            System.out.println(i+1 +". sayiyi giriniz");
            array1[i]=input.nextInt();
        }
        BNumber=array1[0];
        SNumber=array1[0];
        for (int i=0;i<miktar;i++){
            if (BNumber<array1[i]){
                BNumber=array1[i];
            }

            if (SNumber>array1[i]){
                SNumber=array1[i];
            }
        }
        System.out.println("en buyuk sayi=" + BNumber);


        System.out.println("en kucuk deger=" + SNumber);
    }
}
