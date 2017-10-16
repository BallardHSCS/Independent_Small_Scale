import java.time.Month;
import java.util.GregorianCalendar;

public class InterestingDays {
    public static void main(String args[]){
//gets the important dates i need and uses daysFrom to calculate distance
       Day today = new Day();
       Day myBirthday = new Day(2001, 10, 29);
       Day myBirthdayThisYear = new Day(2017,10, 29 );
       Day apDay = new Day (2018, 5,15);
       int myBirthdayIn = myBirthdayThisYear.daysFrom(today);
       int apTestIn = apDay.daysFrom(today);
       int DaysAlive = myBirthday.daysFrom(today);

         //tells user what the numbers mean and prints out the values
       System.out.println("It is my Bday in " + myBirthdayIn +" days!" );
       System.out.println("AP test in "+ apTestIn + " days!");
       System.out.println("The current date is "+ today);
       System.out.println("I have been alive for " + DaysAlive*-1 + " Days");
         //tells user my birthday so they dont forget as they always do ;-;









    }







}
