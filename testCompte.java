 

public class testCompte {
    public static void main(String[] args){
        CompteBancaire c1=new CompteBancaire(250000);
        System.out.println(c1.toString());
        //cree ref (Handle)
        CompteBancaire c2;
        c2=new CompteBancaire(560000 );
        CompteBancaire c3=new CompteBancaire(543000);
        

        System.out.println("\n apres calcul des interets");
        CompteEpagne ce1=new CompteEpagne(0.06f ,1000);
        CompteEpagne ce2=new CompteEpagne(0.01f ,2000);
        CompteEpagne ce3=new CompteEpagne(0.02f,2000);
        
        CompteEpagne[] Agence1={ce1,ce2,ce3};
        for(int i=0;i<3;i++){
            //System.out.println(Agence[i].toString());
            System.out.println(Agence1[i].toString());
            Agence1[i].calculerInteret();
            System.out.println(Agence1[i].toString());
            Agence1[i].verser(200);
            System.out.println(Agence1[i].toString());
        }
        ComptePayante cp1=new ComptePayante(0.05f,"LiLi",5000);
        System.out.println(cp1.toString());
        
        Client cl1=new Client("Anass");
        Agence ag1=new Agence("1400","Hay salam");
        System.out.println(ag1.toString());
        //ag1.addClient(cl1);
        //ag1.addCompte(cp1);

    }

}
