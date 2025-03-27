package za.ac.cput.domain;
import java.time.LocalDateTime;


public class Session {
    private String sessionId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private Parent parent;
    private Nanny nanny;
    private Child child;
    private Driver driver;

    // Constructor
    public Session(String sessionId, LocalDateTime startTime, LocalDateTime endTime, String status, Parent parent, Nanny nanny, Child child, Driver driver) {
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.parent = parent;
        this.nanny = nanny;
        this.child = child;
        this.driver = driver;
    }

    // Getters and Setters
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Nanny getNanny() {
        return nanny;
    }

    public void setNanny(Nanny nanny) {
        this.nanny = nanny;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // toString method
    @Override
    public String toString() {
        return "Session{" +
                "sessionId='" + sessionId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", parent=" + parent +
                ", nanny=" + nanny +
                ", child=" + child +
                ", driver=" + driver +
                '}';
    }
    }

