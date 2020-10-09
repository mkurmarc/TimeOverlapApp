package TimeOverlapApp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // create date and times
        LocalDateTime startDT = LocalDateTime.of(2019,10,30,20,0);
        LocalDateTime endDT = LocalDateTime.of(2019,10,30,20,30);
        LocalDateTime myDT = LocalDateTime.of(2019,10,30,20,45);

        // check time overlap
        if(myDT.isAfter(startDT) && myDT.isBefore(endDT)) {
            System.out.println("myDT is between " + startDT + " and " + endDT);
        }
        else if (myDT.equals(startDT) || myDT.equals(endDT)) {
            System.out.println("Your date and time matches " + startDT + " or " + endDT);
        }
        else {
            System.out.println("Date and time does not overlap.");
        }
    }
}
 