package model;

/**
 * Created by Victor on 4/2/17.
 */
public class Company extends Contact{

    private String name;
    private String description;

    public Company() {
    }

    public Company(String name, int telephone, String email) {
        this.name = name;
        super.setEmail(email);
        super.setTelephone(telephone);
    }
    
    public Company(String name, String description, int telephone, String email, Address address) {
        this(name, telephone, email);
        this.description = description;
        super.setAddress(address);
    }

    public String getDescription() {
        return description;
    }

    @Override
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
