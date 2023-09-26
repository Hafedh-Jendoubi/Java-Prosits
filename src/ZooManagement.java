import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        //-------------------------------- Prosit 1 -------------------------------------//

        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entrer le nombre de cages: ");
        nbrCages = scn.nextInt();
        System.out.println("Enterer le nom du zoo: ");
        zooName = scn1.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");


        //-------------------------------- Prosit 2 -------------------------------------//

        Zoo myZoo = new Zoo("myZoo", "Tunis", 3);
        Animal a1 = new Animal("Otariidae", "Lion", 10, true);
        Animal a2 = new Animal("Canidae", "Wolf", 8, false);
        Animal a4 = new Animal("Otariidae", "Lion", 10, true); //identique de a1 pour vérifier addAnimal() function and searchAnimal()

        //myZoo.displayZoo();
        //System.out.println(myZoo);

        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        System.out.println(myZoo.addAnimal(a4));
        myZoo.displayZoo();

        myZoo.removeAnimal(a1);
        myZoo.displayZoo();
    }
}
