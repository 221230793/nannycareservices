package za.ac.cput.repository;

import za.ac.cput.domain.Driver;

import java.util.List;

public interface IDriverRepository extends IRepository<Driver, Integer> {
    List<Driver> getAll ();

    Driver read(String licenseNumber);

    boolean delete(String licenseNumber);
}