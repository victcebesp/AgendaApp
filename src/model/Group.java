package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 4/2/17.
 */
public class Group {

    List<Contact> listOfContact = new ArrayList<>();
    
    
    
    private final String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addContact(Contact contact){

    }

    public void removeContact(Contact contact){

    }

}
