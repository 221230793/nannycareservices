package za.ac.cput.domain;

//Author: Nakedi Puleng Veronica (222914556)
//Date 16/03/2025
public class Nanny extends Person {

    private int yearsOfExperience;
    private String availability;
    private double hourlyRate;

    private Nanny() {
    }

    public Nanny(Builder builder) {
        this.name = builder.name;
        this.identification = builder.identification;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.yearsOfExperience = builder.yearsOfExperience;
        this.availability = builder.availability;
        this.hourlyRate = builder.hourlyRate;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getAvailability() {
        return availability;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", availability='" + availability + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    public static class Builder {
        private String name;
        private String identification;
        private String email;
        private String phoneNumber;
        private int yearsOfExperience;
        private String availability;
        private double hourlyRate;

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


        public Nanny build() {

            return new Nanny(this);
        }
    }
}

