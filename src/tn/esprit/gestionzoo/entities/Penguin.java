package tn.esprit.gestionzoo.entities;

public non-sealed class Penguin extends Aquatic {
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
}
