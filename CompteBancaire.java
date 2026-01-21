 

public class CompteBancaire {
   static int code = 0;
   float solde;
   String nom;
   int matricule;

   CompteBancaire(float solde) {
      this.solde = solde ;
      this.nom = "Inconnu";
      this.matricule = ++code;
   }

   public void verser(float solde) {
      this.solde += solde;
   }

   public void retirer(float solde) {
      this.solde -= solde;
   }

   public String toString() {
      return "nom: " + this.nom + "|| Solde: " + this.solde + " || Code: " + this.matricule;
   }
}
