package sdf;

public class Car {

    // Members
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    // Constructors are generally added here
    public Car() {
        this.colour = "white";
    }

    public Car(String colour, String registration){
        this.colour = colour;
        this.registration = registration;
    }

    // Setters and getters
    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String r) {
        this.registration = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStarted() {
        return started;
    }

    // Methods
    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

}
