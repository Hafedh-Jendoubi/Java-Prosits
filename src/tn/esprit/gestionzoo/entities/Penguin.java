package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public non-sealed class Penguin extends Aquatic implements Carnivore<Food> {
    private float swimmingDepth;

    public Penguin(){}

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin:\nFamily: " + family + "\nName: " + name + "\nAge: " + age + "\nisMammal: " + isMammal + "\nHabitat: " + habitat + "\nSwimming Depth: " + swimmingDepth + "\n";
    }

    public void swim(){
        System.out.println("This penguin is swimming.\n");
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println(meat);
    }
}
