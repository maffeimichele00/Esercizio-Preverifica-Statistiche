package com.company;

public class ThGenera extends Thread {
// il thread 1 genera la sequenza di caratteri (in cui ogni tanto compaiono degli spazi
// e dei punti) e la inserisce nel buffer, aggiornando le variabili condivise numSpaziInseriti e numPuntiInseriti.
    DatiCondivisi ptrDatiC;

    public ThGenera(DatiCondivisi ptrDatiC) {
        this.ptrDatiC = ptrDatiC;

    }

    public void run() {

        int num = ptrDatiC.getNumeroCaratteri();
        for (int i = 0; i < num; i++) {
            char car = 'a';
            ptrDatiC.setBuffer(car);
            System.out.println("Fine Genera");
        }
    }
}
