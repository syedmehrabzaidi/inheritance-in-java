/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_electronic_devices_examples;

/**
 *
 * @author NAVTTC07
 */
class Electronic_device {

    String name;
    double mac_address;
   String model;
    String colour;

     Electronic_device(String name, Double mac_address, String model, String colour) {
        this.name = name;
        this.mac_address = mac_address;
        this.model = model;
        this.colour = colour;
    }
     void display(){
         System.out.println("Name "+name);
         System.out.println("age "+mac_address);
         System.out.println("contact "+model);
         System.out.println("email "+colour);
         
     }
}

class Laptop extends Electronic_device {

    int garphic_card;
    boolean Mousepad;

     Laptop(String name, double mac_address, String model, String colour,int garphic_card, boolean Mousepad  ) {
        super(name, mac_address, model, colour);
        this.garphic_card = garphic_card;
        this.Mousepad = Mousepad;

    }
    @Override
     void display(){
         super.display();
         System.out.println("garphic_card "+garphic_card);
          System.out.println("Mousepad "+Mousepad);
     }
    
}


class Mobile extends Electronic_device {

    Boolean Sim;
    String Windows;

     Mobile(String name, double mac_address, String model, String colour) {
          super(name, mac_address, model, colour);
        this.Sim=Sim;
        this.Windows=Windows;
    }
    @Override
     void display(){
         super.display();
         System.out.println("Sim "+Sim);
         System.out.println("Windows "+Windows);
         
     }
    
}

public class Inheritance_electronic_devices_examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Laptop l1 = new Laptop("Hp", 595, "Model804", "red", 20,true);
        l1.display();
        Mobile m1=new Mobile("samsung",12,"note9s","blue");
        m1.display();
    
    
    }
    
}
