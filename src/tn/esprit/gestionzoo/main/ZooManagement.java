package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        //-------------------------------- Prosit 1 -------------------------------------//

        /*int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entrer le nombre de cages: ");
        nbrCages = scn.nextInt();
        System.out.println("Enterer le nom du zoo: ");
        zooName = scn1.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");*/


        //-------------------------------- Prosit 2 + 3-------------------------------------//

        /*Zoo myZoo = new Zoo("myZoo", "Tunis");
        Zoo myZoo2 = new Zoo("myZoo2", "Ben Gerdan");
        Animal a1 = new Animal("Otariidae", "Lion", 10, true);
        Animal a2 = new Animal("Canidae", "Wolf", 8, false);
        Animal a3 = new Animal("Canidae", "Wolf", 20, false);
        Animal a4 = new Animal("Otariidae", "Lion", 10, true); //identique de a1 pour vérifier addAnimal() function and searchAnimal()

        //myZoo.displayZoo();
        //System.out.println(myZoo);

        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        myZoo.addAnimal(a3);
        System.out.println(myZoo.addAnimal(a4));
        myZoo.displayZoo();

        myZoo.removeAnimal(a1);
        myZoo.displayZoo();
        System.out.println(myZoo.isZooFull()); //False because myZoo ain't full.
        System.out.println(Zoo.comparerZoo(myZoo, myZoo2));*/

        //-------------------------------- Prosit 4 -------------------------------------//

        /*Zoo myZoo = new Zoo("", "Tunis"); //Just to check the empty name
        Animal a1 = new Animal("Canidae", "Wolf", -1, true); //Checking the negative Age*/

        //-------------------------------- Prosit 5 -------------------------------------//

        Aquatic a1 = new Aquatic();
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        System.out.println(a1.toString()); //
        System.out.println(t1.toString()); //
                                           // => All of these variables have empty attributes due to Default Constructor.
        System.out.println(d1.toString()); //
        System.out.println(p1.toString()); //

        a1.swim();
        d1.swim(); //swim() function a ete redefini ici
        p1.swim(); //swim() function n'a pas ete redefini ici
    }
}