import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee>{
    List<Employee> Employees = new ArrayList<Employee>();

    public SocieteArrayList(){}

    @Override
    public void ajouterEmploye(Employee employee) {
        Employees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employee e : Employees){
            if(e.getNom() == nom){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        for(Employee e : Employees){
            if(e == employee)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        Employees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        System.out.println(Employees);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(Employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employee> NomDepartementCompartor = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };

        Comparator<Employee> GradeCompartor = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };

        Collections.sort(Employees, NomDepartementCompartor.thenComparing(GradeCompartor));
    }
}
