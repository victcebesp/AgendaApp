package model;

/**
 * Created by Victor on 4/2/17.
 */
public class Person extends Contact{

    private final String name;
    private final String surname;
    private final String birthday;

    public Person(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    String getName() {
        return name + surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }
}
