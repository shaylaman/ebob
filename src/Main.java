import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int n1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        int n2 = input.nextInt();
        if(n1>n2){
            int a=n1;
            n1=n2;
            n2=a;
        }

        int ebob = 1;
        int i=1;
        int k=n1;
        while(k>=1){
            if(n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println(n1+" ve "+n2+" sayılarının EBOB'u : "+ebob);
                break;
            }
            k--;
        }

        while(i<=(n1*n2)){
            if (i%n1==0 && i%n2==0){
                System.out.println(n1+" ve "+n2+" sayılarının EKOK'u "+i);
                break;
            }
            i++;
        }
    }
}