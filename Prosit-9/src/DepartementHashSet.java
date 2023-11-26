import com.sun.source.tree.Tree;
import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> Departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        Departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d : Departements){
            if(d.getNom().equals(nom))
                return true;
        }

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        for(Departement d : Departements){
            if(d.equals(departement))
                return true;
        }

        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        if(rechercherDepartement(departement) == true)
            Departements.remove(departement);
        else
            System.out.println("Departement " + departement.getNom() + " n'existe pas.");
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = Departements.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> DepartementsTree = new TreeSet<>(Departements);

        return DepartementsTree;
    }
}
