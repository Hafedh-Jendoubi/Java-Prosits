import java.util.Comparator;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nom;
    private int nbrEmployes;

    public Departement(){}

    public Departement(int id, String nom, int nbrEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbrEmployes = nbrEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof Departement d){
            return id == d.getId() && nom.equals(d.getNom());
        }
        return false;
    }

    @Override
    public String toString(){
        return "Departement:\tID: " + id + "\tName: " + nom + "\tNumber Employes: " + nbrEmployes;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + id;
        result = result * 31 + nom.hashCode();
        return result;
    }

    @Override
    public int compareTo(Departement o) {
        return id - o.getId();
    }
}