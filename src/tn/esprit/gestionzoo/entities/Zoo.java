package tn.esprit.gestionzoo.entities;

public class Zoo {
    final static int NBR_CAGES = 25;
    Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimeaux = 0;

    public Zoo(){
    }

    public Zoo(String name, String city){
        animals = new Animal[NBR_CAGES];
        this.setName(name);
        this.city = city;
    }

    public String getName(){return name;}
    public void setName(String name){
        if(name.isEmpty())
            System.out.println("Can not set an empty Name to the Zoo.");
        else
            this.name = name;
    }

    public void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("List of Animals:\n");
        for(int i=0; i<nbrAnimeaux; i++){
            System.out.println("Animal n°" + (i+1) + ": " + animals[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "City " + city + "\n";
    }

    public boolean addAnimal(Animal animal){
        if(!isZooFull() && (searchAnimal(animal) == -1)) {
            animals[nbrAnimeaux] = animal;
            nbrAnimeaux++;
            return true;
        }else{
            return false;
        }
    }

    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal) == -1){
            return false;
        }else{
            for(int i=searchAnimal(animal); i<nbrAnimeaux; i++){
                animals[i] = animals[i+1];
                nbrAnimeaux--;
            }
            return true;
        }
    }

    public int searchAnimal(Animal animal){
         for(int i=0; i<nbrAnimeaux; i++){
             if(animals[i].getName() == animal.getName()){
                 return i;
             }
         }
         return -1;
    }

    public boolean isZooFull(){
        if(NBR_CAGES == nbrAnimeaux){
            return true;
        }else{
            return false;
        }
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimeaux < z2.nbrAnimeaux)
            return z2;
        else
            return z1;
    }
}