public class Etudiant {
    private int id;
    private String nom;
    private int age;

    public Etudiant(){
        id = 0;
        nom = "";
        age = 0;
    }

    public Etudiant(int id, String nom, int age){
        this.id = id;
        this.nom = nom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Etudiant:\nID: " + id + "\nName: " + nom + "\nAge: " + age;
    }
}
