package model;

/**
 * Created by Victor on 4/2/17.
 */
public class Person extends Contact{

    private String name;
    private String surname;
    private String birthday;

    public Person(String name, String surname, int telephone, String email) {
        this.name = name;
        this.surname = surname;
        super.setTelephone(telephone);
        super.setEmail(email);
    }
    
    public Person(String name, String surname, String birthday, String email,int telephone, Address address) {
        this(name, surname, telephone, email);
        this.birthday = birthday;
        super.setAddress(address);
    }

    @Override
    String getName() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;  
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
}
