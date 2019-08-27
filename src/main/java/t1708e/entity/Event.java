package t1708e.entity;

public class Event {
    private String name;
    private String time;
    private String date;
    private String place;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final class Builder {
        private String name;
        private String time;
        private String date;
        private String place;
        private String description;

        private Builder() {
        }

        public static Builder anEvent() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withTime(String time) {
            this.time = time;
            return this;
        }

        public Builder withDate(String date) {
            this.date = date;
            return this;
        }

        public Builder withPlace(String place) {
            this.place = place;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Event build() {
            Event event = new Event();
            event.setName(name);
            event.setTime(time);
            event.setDate(date);
            event.setPlace(place);
            event.setDescription(description);
            return event;
        }
    }
}
