package za.ac.cput.domain;

public class Session {
        private String sessionId;
        private String date;
        private String time;
        private String status;
        private Parent parent;
        private Driver driver;

        // Constructor
        public Session(String sessionId, String date, String time, String status, Parent parent, Driver driver) {
            this.sessionId = sessionId;
            this.date = date;
            this.time = time;
            this.status = status;
            this.parent = parent;
            this.driver = driver;
        }

        // Getters and Setters
        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
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
                    ", date='" + date + '\'' +
                    ", time='" + time + '\'' +
                    ", status='" + status + '\'' +
                    ", parent=" + parent +
                    ", driver=" + driver +
                    '}';
        }
    }

