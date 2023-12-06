import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EtudiantManagement implements Management{
    public EtudiantManagement(){}

    public void addEtudiant(List<Etudiant> etudiants, Etudiant etudiant){
        etudiants.add(etudiant);
    }

    @Override
    public void displayStudents(List<Etudiant> etudiants, Consumer<Etudiant> con) {
        for(Etudiant etudiant : etudiants){
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for(Etudiant etudiant : etudiants){
            if(pre.test(etudiant)){ //Tests
                con.accept(etudiant); //Displays
            }
        }
    }

    //Not gonna lie, this function is developed by ChatGPT 3.5, an amazing answer! I did not know the existence of such thing called StringBuilder.
    @Override
    public String returnStudentsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun) {
        StringBuilder names = new StringBuilder();
        for (Etudiant etudiant : etudiants) {
            names.append(fun.apply(etudiant)).append(", ");
        }
        return names.toString().trim();
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com) {
        Collections.sort(etudiants, com);
        return etudiants;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants) {
        return etudiants.stream();
    }
}
