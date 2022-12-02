package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {
    @Test
    void testgetNom(){
        fail("Not yet implemented");

    }

    @Test
    void testCompteEpargneStringIntDouble(){
        fail("not yet implemented");
    }

    @Test
    void GetNomRetourneNullSiLeNomInitialise(){
        CompteEpargne sansNom = new CompteEpargne();
        assertNull(sansNom.getNom());
        CompteEpargne avecNom = new CompteEpargne("Ahmed",121,100.0);
        assertEquals("Ahmed",avecNom.getNom());
    }

    @Test
    void CompteEpargneRetourneObjectNonNull(){
        CompteEpargne tawfir = new CompteEpargne("Ali",5222,2500.0);
        assertNotNull(tawfir);
    }
    @Test
    void GetNomRetourneNullSiLeNomEstNonInitialise(){
        CompteEpargne sansNom = new CompteEpargne();
        assertNull(sansNom.getNom());
        CompteEpargne  avecNom = new CompteEpargne("Ahmed",121,1000.0);
        assertEquals("Mohamed",avecNom.getNom());
    }
    






}