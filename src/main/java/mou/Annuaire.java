package mou;

import java.util.ArrayList;

public class Annuaire {
   
    private Composant racine;

    
    public Annuaire(final Composant r) {
        this.racine = r;
    }

    public String hierachie() {
        String s = "";
        ArrayList<String> list = racine.hierarchie();
        for (String mou : list) {
            s = s.concat(mou + "\n");
        }
        return s;
    }

   
}
