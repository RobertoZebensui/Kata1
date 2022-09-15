package kata1_v20220915_1130;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final Calendar birthday;
    private final long MILLISECONDS_PER_YEAR =  (long) (365.25 * 24 * 60 * 60 * 1000);
    
    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return(int) milliSecondsToYear (today.getTimeInMillis() -
                                        this.birthday.getTimeInMillis());
    }
        
    private int milliSecondsToYear(long millis) {
        return (int) (millis / this.MILLISECONDS_PER_YEAR);
    }
    
    
    
}
