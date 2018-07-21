//Dollars.java
import java.util.Scanner;
class Dollars
{
    public static void main(String[] args)
    {
        int dollars;
        int twenties, tens, fives, ones, amount;
        final int TWENTIES = 20;
        final int TENS = 10;
        final int FIVES = 5;
        final int ONES = 1;
            Scanner input = new Scanner (System.in);
                System.out.print("Enter a number of dollars >");
                    dollars = input.nextInt();
                    twenties = dollars/TWENTIES;
                        amount = dollars - (twenties*TWENTIES);
                    tens = dollars/TENS;
                        amount = dollars-(tens*TENS);
                    fives = dollars/FIVES;
                        amount = dollars - (fives*FIVES);
                    ones = amount;
                System.out.println("'$"+dollars+ " ' " + "converted is"+ " ' " + twenties + " ' "+
                                    "$20s,"+ " ' " +tens+ " ' "+ "$10s,"+ " ' "+ fives + " ' " + "$5s,"+
                                    " ' " + ones + " ' "+ "$1s.");
    }
}