package kata1_v20220915_1130;
    
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1_v20220915_1130 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001, 1, 25);
        Person person = new Person("Roberto", date);
        System.out.println(person.getName() + " time " + person.getAge() + " años");
        
    }
    
}
