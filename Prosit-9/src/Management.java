import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {
    void displayStudents(List<Etudiant> etudiants, Consumer<Etudiant> con);
    void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con);
    String returnStudentsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun);
    Etudiant createStudent(Supplier<Etudiant> sup);
    List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com);
    Stream<Etudiant> convertToStream(List<Etudiant> etudiants);
}
