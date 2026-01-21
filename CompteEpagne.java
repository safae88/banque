 

public class CompteEpagne extends CompteBancaire{
        float TauxInteret=0.06f;
        public CompteEpagne(float TauxInteret,float solde){
            super(solde);
            this.TauxInteret=TauxInteret;
        }
        public void calculerInteret(){
            solde=solde*TauxInteret+solde;
        }
        public String toString(){
            return super.toString()+"||| Taux d'interet: "+this.TauxInteret;
        }

        public double getTaux(){
            return TauxInteret;
        } 

        public void verser(float solde){
            super.verser(solde);
        }
        public void retirer(float solde){
            super.retirer(solde);
        }
    }
