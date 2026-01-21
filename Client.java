 
public class Client {
    public final static int NB_MAX_COMPTES =4;
    private int nbComptes=0;
    private static int nbClients=0;
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private CompteBancaire[] mesComptes;

    public Client( String nom ){
        this.nom=nom;
        this.code="C"+ ++nbClients;
        this.mesComptes=new CompteBancaire[NB_MAX_COMPTES];
    }
    
    //setters
    
    public void setNom( String nom){
        this.nom=nom;
    }
    public void setCode( String code){
        this.code=code;
    }
    public void setPrenom( String prenom){
        this.prenom=prenom;
    }
    public void setAdresse( String adresse){
        this.adresse=adresse;
    }
    
    //getters
    
    public String getNom(){
        return this.nom;
    }
    public String getCode(){
        return this.code;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public CompteBancaire getCompte(int nbComptes){
        return this.mesComptes[nbComptes];
    }
    public int getNbComptes(){
        return this.nbComptes;
    }

    //autres methodes
    public void  addCompte(CompteBancaire c){
        if(this.nbComptes<NB_MAX_COMPTES){
            this.mesComptes[this.nbComptes]=c;
            this.nbComptes++;
        }else{
            System.out.println("Nombre max de comptes atteint");
        }
    }

    public void deposer(int index, float montant){
        this.mesComptes[index].verser(montant);
    }
    public void retirer(int index, float montant){
        this.mesComptes[index].retirer(montant);
    }
    //toString
    public String toString(){
        return "Client Code: "+ this.code + " || Nom: " + this.nom +
        " || Prenom: " + this.prenom + " || Adresse: " + this.adresse +
        " || Nombre de comptes: " + this.nbComptes;
    }
}
