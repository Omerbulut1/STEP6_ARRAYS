package STEP6_ARRAYS;
import java.util.Scanner;
import java.util.Random;
public class A6_ARRAYS_Random_BoubleSort {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Random RandomNum=new Random();

        int numbers[],yedek,amount;
        System.out.println("kac adet sayi gireceksiniz");
        amount=input.nextInt();
        numbers=new int[amount];

        for (int i=0;i<amount;i++){
            numbers[i]=RandomNum.nextInt(100);
        }
        for (int i=0;i<amount;i++){
            System.out.print(numbers[i]+"-");
        }
        for (int j=1;j<amount;j++){
            for (int i=0;i<amount-j;i++){
                if (numbers[i]>numbers[i+1]){
                    yedek=numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=yedek;
                }
            }
        }
        System.out.println();
        System.out.println("sirlanmis dizi=");
        for (int i=0;i<amount;i++){
            System.out.print("-" + numbers[i]);
        }
    }
}
