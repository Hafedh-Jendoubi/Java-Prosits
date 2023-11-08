public class EtudiantAlternance extends Etudiant{
    private int salaire;

    public EtudiantAlternance(int identifiant, String nom, String prenom, float moyenne, int salaire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Etudiant Alternance:\nIdentifiant: " + identifiant + "\nNom: " + nom + "\nPrenom: " + prenom + "\nMoyenne: " + moyenne + "\nSalaire: "+ salaire + "\n";
    }

    @Override
    public void ajouterUneAbsence() {
        salaire = salaire - 50;
    }
}
