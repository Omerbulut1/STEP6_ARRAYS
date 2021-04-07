package STEP6_ARRAYS;
import java.util.Scanner;

public class A2_ARRAYS_Atama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;
        int []array1=new int[5];

        for (i=0;i<5;i++){
            System.out.println(i+1 + ". Sayiyi giriniz");
            array1[i]=input.nextInt();
        }
        for (i=0;i<5;i++){
            System.out.println(i+1 + ". Sayi ="+ array1[i]);
        }


    }
}
