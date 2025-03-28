package za.ac.cput.factory;

import java.time.LocalDateTime;
import za.ac.cput.domain.Session;
import za.ac.cput.domain.Nanny;
import za.ac.cput.domain.Parent;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Child;
import za.ac.cput.util.Helper;

//Author: Siganeko Ninzi (222522569)
//Date 18/03/2025
public class SessionFactory {

    public static Session createSession(String sessionId, LocalDateTime startTime, LocalDateTime endTime, String status, Parent parent, Nanny nanny, Child child, Driver driver) {
        // Validate inputs
        if (Helper.isNullOrEmpty(sessionId) || startTime == null || endTime == null || Helper.isNullOrEmpty(status) ||
                parent == null || nanny == null || child == null || driver == null) {
            return null;
        }

        // Check if the status is valid
        if (!Helper.isValidStatus(status)) {
            return null;
        }

        // Check if start time is before end time
        if (!startTime.isBefore(endTime)) {
            return null;
        }

        // Use the builder to construct the Session object
        return new Session.Builder()
                .setSessionId(sessionId)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .setStatus(status)
                .setParent(parent)
                .setNanny(nanny)
                .setChild(child)
                .setDriver(driver)
                .build();
    }

    public static Session createSession(String sessionTest2, LocalDateTime now, LocalDateTime localDateTime, String inactive, String janeDoe, String parentId2, String number, String mail, String johnSmith, String nannyId2, String number1, String mail1, int i, String partTime, double v, String littleSally, int i1, String sarahConnor, String driverId2, String number2, String mail2) {

        return null;
    }
}