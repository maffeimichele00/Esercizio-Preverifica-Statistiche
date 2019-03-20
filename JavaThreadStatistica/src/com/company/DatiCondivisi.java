package com.company;

import java.util.Vector;

public class DatiCondivisi {

    int numSpaziInseriti;
    int numPuntiInseriti;
    int numSpaziLetti;
    int numPuntiLetti;
    char buffer;
    int numeroCaratteri;

    public DatiCondivisi(int x)
    {
        numPuntiInseriti =0;
        numPuntiLetti= 0;
        numSpaziLetti = 0;
        numSpaziInseriti = 0;
        numeroCaratteri = x;

    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public void setNumSpaziInseriti(int numSpaziInseriti) {
        this.numSpaziInseriti = numSpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public void setNumPuntiInseriti(int numPuntiInseriti) {
        this.numPuntiInseriti = numPuntiInseriti;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public void setNumSpaziLetti(int numSpaziLetti) {
        this.numSpaziLetti = numSpaziLetti;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void setNumPuntiLetti(int numPuntiLetti) {
        this.numPuntiLetti = numPuntiLetti;
    }

    public char getBuffer() {
        return buffer;
    }

    public void setBuffer(char buffer) {
        this.buffer = buffer;
    }

    public int getNumeroCaratteri() {
        return numeroCaratteri;
    }

    public void setNumeroCaratteri(int numeroCaratteri) {
        this.numeroCaratteri = numeroCaratteri;
    }


    public void incrementaPuntiLetti()
    {
    numPuntiLetti++;
    }

    public void incrementaSpaziLetti()
    {

        numSpaziLetti++;
    }

    public void incrementaPuntiInseriti()
    {
        numPuntiInseriti++;

    }

    public void incrementaSpaziInseriti()
    {
        numSpaziInseriti++;
    }



}

