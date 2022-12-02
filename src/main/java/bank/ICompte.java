package bank;

public interface ICompte {
    void retirer(double montant);

    void deposer(double montant);

    public int getNumeroCompte();
    public double getSolde();
    public String getNom();
}
