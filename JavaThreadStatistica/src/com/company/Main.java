package com.company;

import java.util.Scanner;

public class Main {

    /*
    * eseStatistiche

Consegnare un programma JAVA su GitHUB che implementa il seguente algoritmo:

Sia dato un buffer condiviso composto nel caso più semplice da un char e nel caso reale da un Vector (documentazione su Vector qui)



Il main all'inizio chiede all'utente quanto deve durare il test (numero di caratteri da generare) poi fa partire i vari thread

- il thread 1 genera la sequenza di caratteri (in cui ogni tanto compaiono degli spazi e dei punti) e la inserisce nel buffer, aggiornando le variabili condivise numSpaziInseriti e numPuntiInseriti.

- il thread 2 in parallelo al thread 1 recupera il o i caratteri dal buffer, conta quanti sono gli spazi presenti e aggiorna la variabile condivisa numSpaziLetti

- il thread 3 in parallelo al thread 1 recupera il o i caratteri dal buffer, conta quanti sono i punti presenti e aggiorna la variabile condivisa numPuntiLetti

- il thread 4 in parallelo a tutti gli altri thread visualizza i valori delle variabili condivise buffer, numSpaziInseriti, numPuntiInseriti, numSpaziLetti, numPuntiLetti solo in seguito ad una modifica.

Al termine il main controlla che il numero di spazi/punti inseriti e calcolati corrispondano.
    *
    * */
    public static void main(String[] args) {
	// write your code here


        Scanner in =  new Scanner(System.in);

        System.out.println("Quanti Caratteri devo generare?");
        int numeroCaratteriDaGenerare = in.nextInt();


        DatiCondivisi datiC = new DatiCondivisi(numeroCaratteriDaGenerare);


        ThGenera th1 = new ThGenera(datiC);
        ThContaPunti th2 = new ThContaPunti(datiC);
        ThContaSpazi th3 = new ThContaSpazi(datiC);
        ThVisualizza th4 = new ThVisualizza(datiC);


        //Faccio partire threadss in parallelo

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        System.out.println("Fine");


    }
}
