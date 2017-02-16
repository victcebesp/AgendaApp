package model;

public abstract class Contact {

    private int telephone;
    private String email;
    private Address address;

    abstract String getName();

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public boolean equals(Object o){
        Contact contact = (Contact) o;
        return this.telephone == contact.telephone &&
               this.email.equals(contact.email) &&
               this.address.equals(contact.address);
    }
    
}
