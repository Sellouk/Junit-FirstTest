package bank;

public class CompteEpargne extends Compte implements ICompte{
    final double TAUXINTERET = 0.01;

    public CompteEpargne(String nom, int numeroCompte, double solde) {
        super(nom, numeroCompte, solde);
    }
    public CompteEpargne(){}

    @Override
    public void retirer(double montant) {
        if(montant>0 && this.getSolde() >= montant){
            System.out.println("Solde Retirer avec succes votre nouveau solde est : " + (this.getSolde()-montant));
        }
        else{
            throw new RuntimeException(" failed solde inferieur a montant ");
        }


    }

    @Override
    public void deposer(double montant) {
        System.out.println("Solde deposer avec success votre nouveau solde est : "+(this.getSolde()+montant));

    }

    @Override
    public int getNumeroCompte() {
        return super.getNumeroCompte();
    }

    @Override
    public double getSolde() {
        return super.getSolde();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
    public double calculerInteret(){
        return this.getSolde()*TAUXINTERET;
    }
}
