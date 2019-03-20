package com.company;

public class ThContaSpazi extends Thread {

    //- il thread 2 in parallelo al thread 1 recupera il o i caratteri dal buffer,
    // conta quanti sono gli spazi presenti e aggiorna la variabile condivisa numSpaziLetti
    DatiCondivisi ptrDatiC;

    public ThContaSpazi(DatiCondivisi ptrDatiC)
    {
        this.ptrDatiC = ptrDatiC;

    }public void run()
    {


        System.out.println("Fine ContaSpazi");
    }
}
