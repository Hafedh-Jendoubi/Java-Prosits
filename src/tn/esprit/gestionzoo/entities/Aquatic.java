package tn.esprit.gestionzoo.entities;

// I can not use implements Carnivore<Food> Here cause Aquatic is a sealed class. Instead, I implemented it in Dolphin and Penguin the subclasses of Aquatic
public sealed class Aquatic extends Animal permits Dolphin, Penguin {
    protected String habitat;

    public Aquatic(){}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic:\nFamily: " + family + "\nName: " + name + "\nAge: " + age + "\nisMammal: " + isMammal + "\nHabitat: " + habitat + "\n";
    }

    public void display(){
        System.out.println("Aquatic:\nFamily: " + family + "\nName: " + name + "\nAge: " + age + "\nisMammal: " + isMammal + "\nHabitat: " + habitat + "\n");
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.\n");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Aquatic aquatic){
            return name.equals(aquatic.name) && age == aquatic.age && habitat.equals(aquatic.habitat);
        }

        return false;
    }
}
