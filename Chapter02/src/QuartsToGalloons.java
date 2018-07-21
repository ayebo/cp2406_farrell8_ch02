//QuratsToGallons
class QuartsToGalloons
{
    public static void main (String[] args)
    {
        final int Quarts_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
            gallonsNeeded = quartsNeeded/Quarts_IN_GALLON;
            extraQuartsNeeded = quartsNeeded%Quarts_IN_GALLON;
        System.out.println("A job that needs"+quartsNeeded+"quarts requires"+gallonsNeeded+"gallons plus"
                    +extraQuartsNeeded+"quarts");

    }
}
