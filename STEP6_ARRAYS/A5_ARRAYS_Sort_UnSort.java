package STEP6_ARRAYS;
import java.util.Scanner;
public class A5_ARRAYS_Sort_UnSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sort[], miktar, yedek;

        System.out.println("kac adet sayi gireceksiniz");
        miktar=input.nextInt();
        sort=new int[miktar];

        for (int i=0;i<miktar;i++){

            System.out.println(i+1 + ". sayiyi giriniz");
            sort[i]=input.nextInt();
        }
        for (int j=1;j<miktar;j++){ //EGER j 1 DEN BASLAMAZSA ALT ALTA 5 KEZ CEVIRIR AMA ALTALTA 4 GRUP VAR


            for (int i=0; i<miktar-j;i++){

                if (sort[i]>sort[i+1]){
                    yedek=sort[i];
                    sort[i]=sort[i+1];
                    sort[i+1]=yedek;
                }
            }
        }
       for (int i=0;i<miktar;i++){
           System.out.print(sort[i]);
           System.out.print("-");
       }
    }
}
