package Replit;

public class Ebob_Ekok {
    public static void main(String[] args) {
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120

        int num1=30;
        int num2=40;
        int gcd=1;
        int lcm=1;

            for (int i=1 ; i<=num1 && i<=num2 ; i++){
                if(num1%i==0 && num2%i==0) {
                    gcd=i;
                }
            } System.out.println(num1+" ve "+num2 +" icin GCD = "+gcd);
            lcm=(num1*num2)/gcd;
            System.out.println(num1+" ve "+num2 +" icin LCM = "+lcm);
        }
    }
