package za.ac.cput.domain;

//Author: Nakedi Puleng Veronica (222914556)
//Date 16/03/2025
public class Nanny extends Person {

    private int yearsOfExperience;
    private String availability;
    private double hourlyRate;

    private Address address;

    //constructor
    private Nanny(Builder builder) {
        super(builder.name, builder.identification,builder.email,builder.phoneNumber);
        this.yearsOfExperience = builder.yearsOfExperience;
        this.availability = builder.availability;
        this.hourlyRate = builder.hourlyRate;
        this.address = builder.address;
    }

    //toString
    @Override
    public String toString() {
        return "Nanny{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", availability='" + availability + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';

    }
//getters

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getAvailability() {
        return availability;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public Address getAddress() {
        return address;
    }



    public static class Builder {
        private String name;
        private String identification;
        private String email;
        private String phoneNumber;
        private int yearsOfExperience;
        private String availability;
        private double hourlyRate;
        private Address address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIdentification(String identification) {
            this.identification = identification;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public Builder setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(Nanny nanny) {
            this.yearsOfExperience = nanny.yearsOfExperience;
            this.availability = nanny.availability;
            this.hourlyRate = nanny.hourlyRate;
            this.address = nanny.address;
            this.name = nanny.name;
            this.identification = nanny.identification;
            this.email = nanny.email;
            this.phoneNumber = nanny.phoneNumber;
            return this;

        }
        public Nanny build() {
            return new Nanny(this);
        }
    }
}

