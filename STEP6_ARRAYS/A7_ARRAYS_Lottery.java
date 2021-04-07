package STEP6_ARRAYS;
import java.util.Random;//                                RANDOM ICIN import ettik
import java.util.Scanner;
public class A7_ARRAYS_Lottery {
    public static void main(String[] args) {
        boolean control;
        int arrayNumbers[], yedek,j=0;
        Random inputRandom=new Random();//                 RANDOM ICIN inputu tanimaladik
        arrayNumbers=new int[6];//                    arrayin boyutunu tanimaldik

        for (int i=0;i<6;i++){
             arrayNumbers[i]=0;
        }
        while(j<6){
            yedek=inputRandom.nextInt(50+1);//      RANDOM ICIN random sayilari tanimladik
            control=true;

                if (arrayNumbers[j]==yedek){
                  control=false;
                }

            if (control);{
                arrayNumbers[j]=yedek;
                j++;
            }
        }
        System.out.println("siralanmamis dizi=");
        for (int i=0;i<6;i++){
            System.out.print(arrayNumbers[i]+ "-");
        }
        for (int k=1;k<6;k++){
            for (int i=0;i<6-k;i++){
                if (arrayNumbers[i]>arrayNumbers[i+1]){
                    yedek=arrayNumbers[i];
                    arrayNumbers[i]=arrayNumbers[i+1];
                    arrayNumbers[i+1]=yedek;
                }
            }
        }
        System.out.print("siralanmis dizi=");
        for (int i=0;i<6;i++){
            System.out.print(arrayNumbers[i] +"-");
        }






    }
}
