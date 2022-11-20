
package finale_projet_;
public class Produits implements Comparable<Produits>{
    
   
    private String id_Produit;
    private String Nom;
    private double mesure;
    private String categorie;
    private double prix_achat;
    private double prix_vente;
    private int quantité;
    private String date_enregistrement;

    public Produits() {
    }

    public Produits(String id_Produit, String Nom, double mesure, String categorie, double prix_achat, double prix_vente,  int quantité,String date_enregistrement) {
        this.id_Produit = id_Produit;
        this.Nom = Nom;
        this.mesure = mesure;
        this.categorie = categorie;
        this.prix_achat = prix_achat;
        this.prix_vente = prix_vente;
        this.quantité = quantité;
        this.date_enregistrement = date_enregistrement;
    }

    public String getId_Produit() {
        return id_Produit;
    }

    public void setId_Produit(String id_Produit) {
        this.id_Produit = id_Produit;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getMesure() {
        return mesure;
    }

    public void setMesure(double mesure) {
        this.mesure = mesure;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

   
    public double getPrix_achat() {
        return prix_achat;
    }

    public void setPrix_achat(double prix_achat) {
        this.prix_achat = prix_achat;
    }

    public double getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(double prix_vente) {
        this.prix_vente = prix_vente;
    }

    /**
     *
     * @return
     */
    public String getDate_enregistrement() {
        return date_enregistrement;
    }

    public void setDate_enregistrement(String  date_enregistrement) {
        this.date_enregistrement = date_enregistrement;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    /**
     *
     * @return
     */
   

        /**
         *
         * @return
         */
        public String affichage() {
        return "ID_Produit     :"+ id_Produit+"\n"+
                "Nom           :"+Nom+"\n"+
                "Mesure         :"+ mesure+"\n"+
                "Categories     :"+categorie+"\n"+
                "Prix_achat     :"+ prix_achat+"\n"+
                "Prix_vente     :"+ prix_vente+"\n"+
                "Quantité       :"+ quantité+"\n"+
               "Date enregistrement :"+ date_enregistrement;
    }

    Object getQuantité(int o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        @Override
        public int compareTo(Produits o) {
            int res=this.Nom.compareToIgnoreCase(o.Nom);
            return res;
        }
}

        
        