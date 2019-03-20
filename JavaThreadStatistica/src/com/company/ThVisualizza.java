package com.company;

public class ThVisualizza extends Thread {
   //- il thread 4 in parallelo a tutti gli altri thread visualizza i valori delle variabili condivise buffer
   // , numSpaziInseriti, numPuntiInseriti, numSpaziLetti, numPuntiLetti solo in seguito ad una modifica.
    DatiCondivisi ptrDatiC;

    public ThVisualizza(DatiCondivisi ptrDatiC)
    {
        this.ptrDatiC = ptrDatiC;

    }
    public void run() {
        System.out.println("Fine Visualizza");
    }
}
