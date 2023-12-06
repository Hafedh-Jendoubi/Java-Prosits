import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* ---------------------------------------- Prosit 09 ------------------------------------------------------ */

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

        /*DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "J24", 15)); //Add Works
        D.ajouterDepartement(new Departement(2, "J23", 15));
        D.ajouterDepartement(new Departement(1, "J22", 15));
        D.displayDepartement(); //It works
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); //It works fine*/

        /* ---------------------------------------- Prosit 11 ------------------------------------------------------ */

        /*AffectationHashMap AHM = new AffectationHashMap();
        Employee e1 = new Employee(1, "Jendoubi", "Hafedh", "J24", 16);
        Employee e2 = new Employee(2, "Jendoubi", "Majdi", "G40", 13);
        Employee e3 = new Employee(3, "Klai", "Rayen", "A23", 15);
        Departement d1 = new Departement(1, "J24", 10);
        Departement d2 = new Departement(2, "J25", 10);

        AHM.ajouterEmployeDepartement(e1, d1); //Add works
        AHM.ajouterEmployeDepartement(e2, d1);
        AHM.ajouterEmployeDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements(); //Display works
        //Adding the same employee in different departments will result in a problem because Employee is a Key. It has to be unique.
        AHM.supprimerEmploye(e2); //Delete works
        AHM.afficherEmployes(); //Employees display works
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(e2)); //False cause we deleted e2. So, it works.
        System.out.println(AHM.rechercherDepartement(d1)); //True so it works
        System.out.println(AHM.trierMap()); //It Works
        AHM.supprimerEmployeEtDepartement(e3, d2); // It works
        AHM.afficherEmployesEtDepartements();*/

        /* ---------------------------------------- Prosit 12 ------------------------------------------------------ */

        List<Etudiant> etudiants = new ArrayList<>();
        EtudiantManagement EM = new EtudiantManagement();
        Etudiant e1 = new Etudiant(1, "Hafedh", 21);
        Etudiant e2 = new Etudiant(2, "Majdi", 24);
        Consumer<Etudiant> con = etudiant -> System.out.println(etudiant.toString());
        Predicate<Etudiant> pre = etudiant -> etudiant.getNom().startsWith("H"); //Checks etudiants that starts with letter "H"
        Function<Etudiant, String> fun = Etudiant::getNom;
        Supplier<Etudiant> sup = Etudiant::new;
        Comparator<Etudiant> comp = Comparator.comparingInt(Etudiant::getId);

        EM.addEtudiant(etudiants, e2);
        EM.addEtudiant(etudiants, e1);

        //EM.displayStudents(etudiants, con); //Display works
        //EM.displayStudentsByFilter(etudiants, pre, con); //Filter works
        //System.out.println(EM.returnStudentsNames(etudiants, fun)); //Names Display works
        /*Etudiant e = EM.createStudent(sup); // It works
        System.out.println(e);*/
        /*etudiants = EM.sortStudentsById(etudiants, comp); //It works
        System.out.println(etudiants);*/
        /*Stream<Etudiant> etudiantStream = EM.convertToStream(etudiants); //It works
        etudiantStream.forEach(System.out::println);*/
        System.out.println("Everything works perfectly!");
    }
}