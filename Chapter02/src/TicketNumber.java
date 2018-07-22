//TicketNumber.java
import javax.swing.JOptionPane;
class TicketNumber
{
    public static void main(String[] args)
    {
        final int CHECK_DIGIT = 7;
        String ticketString;
        int tickNum, newTickNum, lastDigit, reminder;
        boolean result;
            ticketString = JOptionPane.showInputDialog(null, "Enter 6-digit ticket number", "Ticket Number Dialog",
                JOptionPane.INFORMATION_MESSAGE);
                tickNum = Integer.parseInt(ticketString);
                lastDigit = tickNum%10; //get last digit;
                newTickNum = tickNum/10; //remove last digit;
                reminder = tickNum%CHECK_DIGIT;
                result = (reminder == lastDigit);
            JOptionPane.showMessageDialog(null, "For ticker Number"+ " \" "+ tickNum +"\""+
                ",last digit is"+ " \" "+ lastDigit+ " \" " + "and reminder is"+ " \" "+ reminder+ " \" "+
                    ",\n so result is"+ " \" "+result+ " \" ;");
    }
}
