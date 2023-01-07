package sdf;

public class CarMain {
    
    // ENTRY POINT
    public static void main(String[] args) {
        
        // Instantiate a car
        Car c = new Car();
        c.setColour("grey");
        c.setRegistration("SJB6727K");
        c.start();
        System.out.printf("The colour of car c is %s\n", c.getColour());

        Car d = new Car();
        System.out.printf("The colour of car d is %s\n", d.getColour());

        Car e = new Car("black", "SCK5892R");
        System.out.printf("Colour of car e is %s\n", e.getColour());
        System.out.printf("The registration number for car e is %s\n", e.getRegistration());

        Porche p = new Porche();
        System.out.printf("The colour of Porche is %s\n", p.getColour());
        p.setColour("Pink");
        System.out.printf("The colour of the Porche is now %s\n", p.getColour());
    }
}
