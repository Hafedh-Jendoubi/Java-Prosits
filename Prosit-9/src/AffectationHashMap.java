import java.util.*;

public class AffectationHashMap {
    private Map<Employee, Departement> details;

    public AffectationHashMap(){
        details = new HashMap<>();
    }

    public AffectationHashMap(Map<Employee, Departement> details) {
        this.details = details;
    }

    public Map<Employee, Departement> getDetails() {
        return details;
    }

    public void setDetails(Map<Employee, Departement> details) {
        this.details = details;
    }

    public void ajouterEmployeDepartement(Employee e, Departement d){
        e.setNomDepartement(d.getNom()); //to make sure the department of the employee is not different from the department itself.
        details.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employee, Departement> entry : details.entrySet()){
            System.out.println(entry.getKey().getNom() + ", " + entry.getKey().getPrenom() + ": Department: " + entry.getValue().getNom());
        }
    }

    public void supprimerEmploye(Employee e) {
        if (details.containsKey(e))
            details.remove(e);
        else
            System.out.println("Employee n'existe pas.");
    }

    public void supprimerEmployeEtDepartement(Employee e, Departement d){
        if(details.containsKey(e) && details.containsValue(d))
            details.remove(e, d);
        else
            System.out.println("Employee or Departement n'existe pas.");
    }

    public void afficherEmployes(){
        Set<Employee> employees = details.keySet();
        Iterator<Employee> iterator = employees.iterator();
        System.out.println("Employees IDs:");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getID());
        }
    }

    public void afficherDepartments(){
        Collection<Departement> departments = details.values();
        System.out.println("Departments: ");
        for(Departement d : departments){
            System.out.println(d.getId() + ", " + d.getNom());
        }
    }

    public boolean rechercherEmploye(Employee e){
        return details.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return details.containsValue(d);
    }

    TreeMap<Employee, Departement> trierMap(){
        Comparator<Employee> Compartor = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getID() - o2.getID();
            }
        };
        TreeMap<Employee, Departement> newDetails = new TreeMap<>(Compartor);
        newDetails.putAll(details);
        return newDetails;
    }
}
