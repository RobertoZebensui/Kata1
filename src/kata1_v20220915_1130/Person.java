package kata1_v20220915_1130;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return(int) ((new Date().getTime() - birthday.getTime())/31557600000L);
    }
}
