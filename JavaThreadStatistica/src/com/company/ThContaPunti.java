package com.company;

public class ThContaPunti extends Thread
{
//- il thread 3 in parallelo al thread 1 recupera il o i caratteri dal buffer,
// conta quanti sono i punti presenti e aggiorna la variabile condivisa numPuntiLetti
    DatiCondivisi ptrDatiC;
    boolean  fine;

    public ThContaPunti(DatiCondivisi ptrDatiC)
    {
        this.ptrDatiC = ptrDatiC;
        fine = false;

    }
    @Override
    public void run() {
        while(!fine) {
            char tmp = ptrDatiC.getBuffer();
            if (tmp == '.') {
                ptrDatiC.incrementaPuntiLetti();
            }

        }
        System.out.println("Fine ContaPunti");
    }
}
