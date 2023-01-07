package sdf;

public class CarMain2 {
    
    public static void main(String[] args) {
        Porche p = new Porche();

        Car c = new Porche("yellow" , "S8888Z"); // Is this permissible? A Porche is a car

        System.out.printf(">>>> Registration no. of c: %s\n", c.getRegistration());

        p = (Porche)c; // Casting forces the parent to be the child
        p.accelerate();

        System.out.printf(">>>> Registration no. of p: %s\n and colour is: %s\n", p.getRegistration(), p.getColour());

        

    }
}
