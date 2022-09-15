package kata1_v20220915_1130;
    
import java.time.LocalDate;
import java.time.Month;

public class Kata1_v20220915_1130 {

    public static void main(String[] args) {        
        Person person = new Person("Roberto", LocalDate.of(2001, Month.JANUARY, 25));
        System.out.println(person.getName() + " time " + person.getAge() + " años");
        
    }
    
}
