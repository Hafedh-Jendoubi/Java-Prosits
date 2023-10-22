package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(){
    }

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.setAge(age);
        this.isMammal = isMammal;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getAge(){return age;}
    public void setAge(int age){
        if(age < 0)
            System.out.println("Can not set a negative age");
        else
            this.age = age;
    }

    @Override
    public String toString() {
        if(isMammal)
            return "Family: " + family + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "isMammal: Yes\n";
        else
            return "Family: " + family + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "isMammal: No\n";
    }
    public void displayAnimal(){
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(isMammal)
            System.out.println("isMammal: Yes");
        else
            System.out.println("isMammal: No");
    }
}
