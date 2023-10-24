package tn.esprit.gestionzoo.entities;

public class Zoo {
    final static int NBR_CAGES = 25;
    final static int NBR_MAX_AQUATICS = 10;
    private int nbrAnimeaux = 0;
    private int nbrAquatics = 0;
    Animal[] animals;
    Aquatic[] aquaticAnimals;
    private String name;
    private String city;

    public Zoo(){
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        aquaticAnimals = new Aquatic[NBR_MAX_AQUATICS];
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

    public int getNbrAnimeaux() {
        return nbrAnimeaux;
    }

    public void setNbrAnimeaux(int nbrAnimeaux) {
        this.nbrAnimeaux = nbrAnimeaux;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return "Name: " + name + "\nCity " + city + "\nNumber Animals: " + nbrAnimeaux;
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

    public void addAquaticAnimal(Aquatic aquatic){
        if(nbrAquatics < NBR_MAX_AQUATICS){
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
        }else{
            System.out.println("Table is full\n");
        }
    }

    public void instruction27(){
        for(int i=0; i<nbrAquatics; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxSwimmingDepth = -1;

        for(int i=0; i<nbrAquatics; i++){
            if((aquaticAnimals[i] instanceof Penguin) && (((Penguin) aquaticAnimals[i]).getSwimmingDepth() > maxSwimmingDepth)){
                maxSwimmingDepth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }

        return maxSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrDolphins = 0;
        int nbrPenguins = 0;

        for(int i=0; i<nbrAquatics; i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nbrPenguins++;
            }else if(aquaticAnimals[i] instanceof Dolphin){
                nbrDolphins++;
            }
        }

        System.out.println("Number of Dolphins: " + nbrDolphins);
        System.out.println("Number of Penguins: " + nbrPenguins);
    }
}