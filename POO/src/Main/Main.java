package Main;


import Exo.TestCompte;
import Exo2.Execution;
import Exo2.Voiture;
import Exo3.TestRectangle;

public class Main {
    public static void main (String[] args) {

        TestCompte t = new TestCompte();
        t.test();

        Execution e = new Execution();
        e.execute();

        TestRectangle r = new TestRectangle();
        r.resultats();
        }
    }

