package model;

/**
 * Created by Victor on 4/2/17.
 */
public class Company extends Contact{

    private final String name;
    private final String description;

    public Company(String name, String description) {
        this.name = name;
        this.description = description;
    }



    public String getDescription() {
        return description;
    }

    @Override
    String getName() {
        return name;
    }
}
