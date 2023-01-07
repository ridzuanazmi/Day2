package sdf;

public class Porche extends Car {

    private String turbo = "off";
    private int accelerate = 0;
    
    public Porche() {
        super.setColour("red"); // super is to call the parent method
    }

    public Porche(String colour, String registration) {
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() {
        return turbo;
    }

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }

    public void deccelerate (){
        this.accelerate--;
        if (this.accelerate <= 4) {
            this.turbo = "off";
        }
    }
}
