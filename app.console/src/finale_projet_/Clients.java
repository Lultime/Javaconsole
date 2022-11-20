
package finale_projet_;
public class Clients {
   private String id_clients; 
        private String nom;
      private String prenom;
      private String adresse;
          private String email;
         private String sexe;
          private String telephone;
    public Clients() {
    }
         

    public Clients(String id_clients,  String nom, String prenom, String adresse,String email,  String sexe,String telephone) {
        this.id_clients = id_clients;
             this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
          this.sexe = sexe;
           this.telephone = telephone;
    }

    public String getId_clients() {
        return id_clients;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getSexe() {
        return sexe;
    }
   


    public void setId_clients(String id_clients) {
        this.id_clients = id_clients;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
     
      public String toclients(){
          return  "id_client      :"+id_clients+"\n"+
                  "Nom            :"+nom+"\n"+
                  "Prenom         :"+prenom+"\n"+
                  "Adresse        :"+adresse+"\n"+
                  "sexe           :"+sexe +"\n"+
                  "email          :"+email+"\n"+
                  "telephone      :"+telephone+"\n";
      }   
}
