package I_Strategy_Pattern;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import sun.util.calendar.BaseCalendar;

public class Main_Program {

    public static void main(String[] args) {

        ShoppingCard card = new ShoppingCard(null);
        card.setCustomerName("Ahmed Adel");
        card.setBillAmount(50.5);

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        Date date = calendar.getTime();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 6:   // Friday
                card.interface1 = new FridayDiscound();
                break;
            
            case 7:   // Saturday
                card.interface1 = new SaturdayDiscound();
                break;
            
            default:
                card.interface1 = new AnyDay();
                break;

        }
    }
}
