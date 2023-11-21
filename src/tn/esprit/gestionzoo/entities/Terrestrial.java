package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Omnivore;
import tn.esprit.gestionzoo.enums.Food;

public final class Terrestrial extends Animal implements Omnivore<Food>{
    private int nbrLegs;

    public Terrestrial(){}

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial:\nFamily: " + family + "\nName: " + name + "\nAge: " + age + "\nisMammal: " + isMammal + "\nNumber Legs: " + nbrLegs + "\n";
    }

    @Override
    public void eatMeat(Object meat) {
        System.out.println("It is MEAT");
    }

    @Override
    public void eatPlant(Object plant) {
        System.out.println("It is a PLANT");
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println(food);
    }
}
