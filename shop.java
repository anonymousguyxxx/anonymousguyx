package shop;
import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Code");
        System.out.println("1 :: COMPUTER");
        System.out.println("2 :: LAPTOP");
        System.out.println("3 :: HARDISK");
        int choice = scn.nextInt();
        switch (choice)
        {
            case 1: 
            {
                System.out.println("YOU CHOOSED COMPUTER CATEGORGY");
                System.out.println("Enter your amount");
                int amount = scn.nextInt();
                if (amount <= 1000)
                {
                    double discount = amount*0.05;
                    double tax = amount*0.01;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
                else if (amount >=1000  && amount <= 5001)
                        {
                            double discount = amount*0.10;
                            double tax = amount*0.01;
                            double pay = amount+tax-discount;
                            System.out.println("Your discount is " +discount);
                            System.out.println("Including of tax of " +tax);
                           System.out.println("Your payable amount is " +pay);
                           break;
                        }
                else if (amount >= 5000)
                {
                    double discount = amount*0.20;
                    double tax = amount*0.03;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
            }
            case 2: 
            {
                System.out.println("YOU CHOOSED LAPTOP CATEGORGY");
                System.out.println("Enter your amount");
                int amount = scn.nextInt();
                if (amount <= 2500)
                {
                    double discount = amount*0.15;
                    double tax = amount*0.01;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
                else if (amount >=2500  && amount <= 5001)
                        {
                            double discount = amount*0.20;
                            double tax = amount*0.01;
                            double pay = amount+tax-discount;
                           System.out.println("Your discount is " +discount);
                           System.out.println("Including of tax of " +tax);
                           System.out.println("Your payable amount is " +pay);
                           break;
                        }
                else if (amount >= 5000)
                {
                    double discount = amount*0.26;
                    double tax = amount*0.03;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
            }
            case 3: 
            {
                System.out.println("YOU CHOOSED HARD DISK CATEGORGY");
                System.out.println("Enter your amount");
                int amount = scn.nextInt();
                if (amount <= 500)
                {
                    double discount = amount*0.01;
                    double tax = amount*0.01;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
                else if (amount >=500  && amount <= 1501)
                        {
                            double discount = amount*0.05;
                            double tax = amount*0.01;
                            double pay = amount+tax-discount;
                            System.out.println("Your discount is " +discount);
                            System.out.println("Including of tax of " +tax);
                            System.out.println("Your payable amount is " +pay);
                            break;
                        }
                else if (amount >= 1500)
                {
                    double discount = amount*0.10;
                    double tax = amount*0.01;
                    double pay = amount+tax-discount;
                    System.out.println("Your discount is " +discount);
                    System.out.println("Including of tax of " +tax);
                    System.out.println("Your payable amount is " +pay);
                    break;
                }
            }
        }
    }
    
}
