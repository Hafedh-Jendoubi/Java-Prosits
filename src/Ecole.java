import javax.xml.namespace.QName;

public class Ecole {
    private String nom;
    private Etudiant[] etudiants;
    private int NBR_ETUDIANT = 0;
    final int MAX_ETUDIANTS = 500;
    public Ecole(){}

    public Ecole(String nom){
        this.nom = nom;
        this.etudiants = new Etudiant[MAX_ETUDIANTS];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    public int getNBR_ETUDIANT() {
        return NBR_ETUDIANT;
    }

    public void setNBR_ETUDIANT(int NBR_ETUDIANT) {
        this.NBR_ETUDIANT = NBR_ETUDIANT;
    }

    @Override
    public String toString()
    {
        String msg = "Ecole " + nom + ":\n";
        for(int i = 0; i<NBR_ETUDIANT; i++){
            msg += etudiants[i].toString();
        }

        return msg;
    }

    public void ajouterEtudiant(Etudiant e) {
        if(rechercherEtudiant(e) == -1 && NBR_ETUDIANT < MAX_ETUDIANTS) {
            etudiants[NBR_ETUDIANT] = e;
            NBR_ETUDIANT++;
        }else{
            System.out.println("Etudiant existe deja ou Ecole est full\n");
        }
    }

    public int rechercherEtudiant(Etudiant e){
        for(int i=0; i<NBR_ETUDIANT; i++){
            if(etudiants[i].equals(e))
                return i;
        }
        return -1;
    }

    public float getMoyenneDes3A(){
        float sum_moy = 0;
        int nbr_3emeEtudiant = 0;

        for(int i=0; i<NBR_ETUDIANT; i++){
            if(etudiants[i] instanceof Etudiant3eme e){
                sum_moy = sum_moy + e.moyenne;
                nbr_3emeEtudiant++;
            }
        }

        return sum_moy / nbr_3emeEtudiant;
    }

    public int moyenneSalaireAlternants(){
        int sum_salaire = 0;
        int nbr_3emeAlternance = 0;

        for(int i=0; i<NBR_ETUDIANT; i++){
            if(etudiants[i] instanceof EtudiantAlternance e){
                sum_salaire = sum_salaire + e.getSalaire();
                nbr_3emeAlternance++;
            }
        }

        return sum_salaire / nbr_3emeAlternance;
    }

    public void changerEcole(Etudiant etd, Ecole e){
        if(rechercherEtudiant(etd) == -1){
            System.out.println("Etudiant n'existe pas dans cette Ecole\n");
        }else{
            for(int i=rechercherEtudiant(etd); i<NBR_ETUDIANT; i++){
                etudiants[i] = etudiants[i+1];
            }
            etudiants[NBR_ETUDIANT] = null;
            NBR_ETUDIANT--;
            System.out.println("Etudiant has been removed\n");
        }
    }
}
