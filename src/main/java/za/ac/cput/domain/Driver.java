package za.ac.cput.domain;

public class Driver extends Person {

    private String vehicleDetails;
    private String availability;
    private String licenseNumber;

    private Driver() {
    }

    private Driver(Builder builder) {
        this.name = builder.name;
        this.identification = builder.identification;
        this.email = builder.email;
        this.vehicleDetails = builder.vehicleDetails;
        this.availability= builder.availability;
        this.licenseNumber= builder.licenseNumber;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public String getAvailability() {
        return availability;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", email='" + email + '\'' +
                ", vehicleDetails='" + vehicleDetails + '\'' +
                ", availability='" + availability + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String identification;
        private String email;
        private String vehicleDetails;
        private String availability;
        private String licenseNumber;

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

        public String setVehicleDetails() {
            return vehicleDetails;
        }

        public String setAvailability() {
            return availability;
        }

        public Builder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
    }

    public Driver build() {
        return new Driver(this);
    }
}

