package przyklad4;

import java.util.Random;

public interface Postac extends ZywyObiekt {
    // pola interfejsow
    String LOKACJA_STARTOWA= "Tawerna";

    // metody interfejsow
    void walcz();

    default String nazwaInterfejsu(){return "Porstac";}
    default int iloscPunktoZycia(){return wygenerujPZ();}

    private int wygenerujPZ(){
        Random random= new Random();
        return random.nextInt((10-6)+1)+6;
    }
}
