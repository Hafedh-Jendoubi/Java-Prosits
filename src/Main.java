public class Main {
    public static void main(String[] args) {
        Ecole E = new Ecole("ESPRIT");
        Etudiant3eme e1 = new Etudiant3eme(1, "Jendoubi", "Hafedh", 14.5f, "Math");
        EtudiantAlternance e2 = new EtudiantAlternance(2, "Jendoubi", "Majdi", 15f, 500);
        Etudiant3eme e3 = new Etudiant3eme(3, "Jendoubi", "Slah", 19f, "Math");

        //System.out.println(e1.equals(e2));
        //System.out.println(e1.toString());
        E.ajouterEtudiant(e1); E.ajouterEtudiant(e2); E.ajouterEtudiant(e3);
        //System.out.println(E.rechercherEtudiant(e2));
        //System.out.println(E.getMoyenneDes3A());
        //System.out.println(E.toString());
        E.changerEcole(e1, E);
        System.out.println(E.toString());
    }
}
