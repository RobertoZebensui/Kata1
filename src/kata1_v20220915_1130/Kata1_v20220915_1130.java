package kata1_v20220915_1130;
    
import java.util.Date;

public class Kata1_v20220915_1130 {

    public static void main(String[] args) {
        Person person = new Person("Roberto", new Date( 101, 0, 25));
        System.out.println(person.getName() + " time " + person.getAge() + " años");
        
    }
    
}
