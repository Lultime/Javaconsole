package finale_projet_;
public class Ventes {
    private String id_ventes;
     private String id_clients;
      private String produits_achetés;
       private String Mode_paiement;
        private int quantite_achete;
         private String date_vente;

    public Ventes() {
    }

    public Ventes(String id_ventes, String id_clients, String produits_achetés, String Mode_paiement, int quantite_achete, String date_vente) {
        this.id_ventes = id_ventes;
        this.id_clients = id_clients;
        this.produits_achetés = produits_achetés;
        this.Mode_paiement = Mode_paiement;
        this.quantite_achete = quantite_achete;
        this.date_vente = date_vente;
    }

    public String getId_ventes() {
        return id_ventes;
    }

    public String getId_clients() {
        return id_clients;
    }

    public String getProduits_achetés() {
        return produits_achetés;
    }

    public String getMode_paiement() {
        return Mode_paiement;
    }

    public int getQuantite_achete() {
        return quantite_achete;
    }

    public String getDate_vente() {
        return date_vente;
    }

    public void setId_ventes(String id_ventes) {
        this.id_ventes = id_ventes;
    }

    public void setId_clients(String id_clients) {
        this.id_clients = id_clients;
    }

    public void setProduits_achetés(String produits_achetés) {
        this.produits_achetés = produits_achetés;
    }

    public void setMode_paiement(String Mode_paiement) {
        this.Mode_paiement = Mode_paiement;
    }

    public void setQuantite_achete(int quantite_achete) {
        this.quantite_achete = quantite_achete;
    }

    public void setDate_vente(String date_vente) {
        this.date_vente = date_vente;
    }

    /**
     *
     * @return
     */
    public String toventes(){
        return  "id_ventes         :"+id_ventes+"\n"+
                "id_clients        :"+id_clients+"\n"+
                "produits achetés  :"+produits_achetés+"\n"+ 
                "Mode paiement     :"+Mode_paiement+"\n"+
                "Date vente        :"+date_vente+"\n"+
                "Quantités acheté  :"+quantite_achete;
    }
      
}
