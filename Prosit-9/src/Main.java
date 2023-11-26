import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*SocieteArrayList S = new SocieteArrayList();
        Employee e1 = new Employee(1, "Jendoubi", "Hafedh", "J24", 16);
        Employee e2 = new Employee(2, "Jendoubi", "Majdi", "G40", 13);
        Employee e3 = new Employee(3, "Klai", "Rayen", "A23", 15);
        Employee e4 = new Employee(4, "Mhamdi", "Ahlem", "A23", 18);

        S.ajouterEmploye(e4); //Add works
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1)); //True, it works
        S.displayEmploye(); //Display works
        System.out.println("\n"); //Display purposes
        S.supprimerEmploye(e1); //Delete works
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("Andolsi")); //False, it works
        System.out.println("\n"); //Display purposes
        S.trierEmployeParId(); //Tri ID works
        S.displayEmploye();
        System.out.println("\n"); //Display purposes
        S.trierEmployeParNomDepartementEtGrade(); //Tri NomDepartement then Grade works
        S.displayEmploye();*/

        /* ---------------------------------------- Prosit 10 ------------------------------------------------------ */

        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "J24", 15)); //Add Works
        D.ajouterDepartement(new Departement(2, "J23", 15));
        D.ajouterDepartement(new Departement(1, "J22", 15));
        D.displayDepartement(); //It works
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); //It works fine
    }
}