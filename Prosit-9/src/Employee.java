public class Employee implements Comparable<Employee>{
    private int ID;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employee(){
        this.ID = 0;
        this.nom = "";
        this.prenom = "";
        this.nomDepartement = "";
        this.grade = 0;
    }

    public Employee(int ID, String nom, String prenom, String nomDepartement, int grade) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Employee employee){
            return ID == employee.ID && nom.equals(employee.nom);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Employee:\nID: " + ID + "\tFirst Name: " + nom + "\tLast Name: " + prenom + "\tDepartment Name: " + nomDepartement + "\tGrade: " + grade + "\n";
    }

    @Override
    public int compareTo(Employee e){
        return ID - e.ID;
    }
}
