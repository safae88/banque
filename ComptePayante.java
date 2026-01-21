 
public class ComptePayante extends CompteBancaire {
    private float TauxOp;
        public ComptePayante(float op,String nom,float solde){
            super(solde);
            this.TauxOp= op;
        }
        public void calculerInteret(){
            solde=solde*TauxOp+solde;
        }
        public String toString(){
            return super.toString()+"||| Taux d'interet: "+this.TauxOp;
        }

        public double getTaux(){
            return TauxOp;
        } 

        public void verser(float solde){
            super.verser(solde);
            super.retirer(TauxOp);
        }
        public void retirer(float solde){
            super.retirer(solde);
            super.retirer(TauxOp);
        }
}
