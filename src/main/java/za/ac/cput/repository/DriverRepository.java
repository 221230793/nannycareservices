package za.ac.cput.repository;

import za.ac.cput.domain.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverRepository implements IDriverRepository {
    @Override
    public Driver read(Integer integer) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }

    private List<Driver> driverList;

    // Constructor to initialize the list
    private DriverRepository() {
        driverList = new ArrayList<>();
    }

    // Static method to access the repository (singleton pattern)
    public static DriverRepository getRepository() {
        return new DriverRepository();
    }

    @Override
    public List<Driver> getAll() {
        return driverList;
    }

    @Override
    public Driver create(Driver driver) {
        boolean success = driverList.add(driver);
        return success ? driver : null;
    }

    @Override
    public Driver read(String licenseNumber) {
        for (Driver d : driverList) {
            if (d.getLicenseNumber().equals(licenseNumber)) {
                return d;
            }
        }
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        String licenseNumber = driver.getLicenseNumber();
        Driver oldDriver = read(licenseNumber);

        if (oldDriver == null)
            return null;


        int index = driverList.indexOf(oldDriver);
        if (index != -1) {
            driverList.set(index, driver);
            return driver;
        }

        return null;
    }

    @Override
    public boolean delete(String licenseNumber) {
        Driver driverToDelete = read(licenseNumber);
        return driverToDelete != null && driverList.remove(driverToDelete);
    }
}
