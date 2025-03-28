package za.ac.cput.domain;

import java.time.LocalDateTime;

//Author: Siganeko Ninzi (222522569)
//Date 16/03/2025
public class Session {

    private String sessionId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private Parent parent;
    private Nanny nanny;
    private Child child;
    private Driver driver;

    public Session(String sessionId, LocalDateTime startTime, LocalDateTime endTime, String newStatus, Parent parent, Nanny nanny, Child child, Driver driver) {}

    public Session(Builder builder) {
        this.sessionId = builder.sessionId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.status = builder.status;
        this.parent = builder.parent;
        this.nanny = builder.nanny;
        this.child = builder.child;
        this.driver = builder.driver;
    }

    // Getters
    public String getSessionId() {
        return sessionId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getStatus() {
        return status;
    }

    public Parent getParent() {
        return parent;
    }

    public Nanny getNanny() {
        return nanny;
    }

    public Child getChild() {
        return child;
    }

    public Driver getDriver() {
        return driver;
    }

    // Setters
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setNanny(Nanny nanny) {
        this.nanny = nanny;
    }

    public void setChild(Child child) {
        this.child = child;
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

    public static class Builder {
        private String sessionId;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String status;
        private Parent parent;
        private Nanny nanny;
        private Child child;
        private Driver driver;

        public Builder setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setParent(Parent parent) {
            this.parent = parent;
            return this;
        }

        public Builder setNanny(Nanny nanny) {
            this.nanny = nanny;
            return this;
        }

        public Builder setChild(Child child) {
            this.child = child;
            return this;
        }

        public Builder setDriver(Driver driver) {
            this.driver = driver;
            return this;
        }

        public Session build() {
            return new Session(this);
        }
    }
}