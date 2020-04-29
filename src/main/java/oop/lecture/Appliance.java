package oop.lecture;

import lombok.Setter;

@Setter
public class Appliance {
    private boolean inShop = true;

    public Appliance(){
        System.out.println("Appliance");
    }

    public void printLocation(){
        if (inShop) {
            System.out.println("I'm in shop");
        }else{
            System.out.println("I'm at home");
        }
    }
}
