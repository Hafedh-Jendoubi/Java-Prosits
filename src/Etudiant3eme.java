public class Etudiant3eme extends Etudiant{
    private String branche;

    Etudiant3eme(int identifiant, String nom, String prenom, float moyenne, String branche){
        super(identifiant, nom, prenom, moyenne);
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public String toString() {
        return "Etudiant 3eme:\nIdentifiant: " + identifiant + "\nNom: " + nom + "\nPrenom: " + prenom + "\nMoyenne: " + moyenne + "\nBranche: " + branche + "\n";
    }

    @Override
    public void ajouterUneAbsence() {
        moyenne = moyenne - 0.5f;
    }
}