
package coursjavadut1;
public class Etudiants {
private String id;
private String nom;
private String prenom;
private String sexe;
private String telephone;

    public Etudiants() {
    }

    public Etudiants(String id, String nom, String prenom, String sexe, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "ID        :"+id+"\n"+
               "Nom       :"+nom+"\n"+
               "Prenom    :"+prenom+"\n"+
               "Sexe      :"+sexe+"\n"+
               "Telephone :"+telephone;
    }
    
    





}
