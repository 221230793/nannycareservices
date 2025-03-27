package za.ac.cput.factory;
import java.time.LocalDateTime;
import za.ac.cput.domain.Session;
import za.ac.cput.domain.Nanny;
import za.ac.cput.domain.Parent;
import za.ac.cput.domain.Driver;
import za.ac.cput.domain.Child;

public class SessionFactory {
    public static Session createSession(String sessionId, LocalDateTime startTime, LocalDateTime endTime, String status, Parent parent, Nanny nanny, Child child, Driver driver) {
        return new Session(sessionId, startTime, endTime, status, parent, nanny, child, driver);
    }
}
