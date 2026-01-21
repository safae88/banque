

public class Agence {
    String nom;
    String numero;
    String adresse;
    Client[] lesclients;
    CompteBancaire[] lescomptes;

    //constructeur
    public Agence(String num , String adr){
      this.numero=num;
      this.adresse=adr;
      lesclients=new Client[5];
      lescomptes=new CompteBancaire[5];
    }

    //getters 
    public CompteBancaire getCompte(int index){
        return this.lescomptes[index];
    }

    public Client getClient(int index){
        return this.lesclients[index];
    }

    public int getNbClients(){
        return this.lesclients.length;
    }

    public int getNbComptes(){
        return this.lescomptes.length;
    }

    public String getNumero(){
        return this.numero;
    }
    public String getAdresse(){
        return this.adresse;
    }

    //setters
    public void setNumero(String num){
        this.numero=num;
    }
    public void setAdresse(String adr){
        this.adresse=adr;
    }

    //toString
    public String toString(){
        return "Nom :"+ this.nom + " || Agence numero: "+ this.numero + " || Adresse: " + this.adresse;
    }
    //autres methodes
    public void addCompte(CompteBancaire c){
        for(int i=0;i<this.lescomptes.length;i++){
            if(this.lescomptes[i]==null){
                this.lescomptes[i]=c;
                break;
            }
        }
    }
    public void addClient(Client c){
        for(int i=0;i<this.lesclients.length;i++){
            if(this.lesclients[i]==null){
                this.lesclients[i]=c;
                break;
            }
        }
    }
}