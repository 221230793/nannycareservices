package za.ac.cput.factory;

import za.ac.cput.domain.Driver;

public class DriverFactory {
    public static Driver createDriver(String name, String identification, String email,
                                      String vehicleDetails, String availability, String licenseNumber) {
        if (name == null || name.isEmpty() || identification == null || identification.isEmpty() ||
                email == null || email.isEmpty() || vehicleDetails == null || vehicleDetails.isEmpty() ||
                availability == null || availability.isEmpty() || licenseNumber == null || licenseNumber.isEmpty()) {
            return null;
        }

        return new Driver.Builder()
                .setName(name)
                .setIdentification(identification)
                .setEmail(email)
                .setVehicleDetails(vehicleDetails)
                .setAvailability(availability)
                .setLicenseNumber(licenseNumber)
                .build();
    }
}
