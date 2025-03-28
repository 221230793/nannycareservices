package za.ac.cput.domain;

public abstract class Person {
    protected String name;
    protected String identification;
    protected String email;
    protected String phoneNumber;

    public Person(String name, String identification, String email, String phoneNumber) {
        this.name = name;
        this.identification = identification;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public abstract String toString();


}
