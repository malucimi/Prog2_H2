package org.htw.prog2.aufgabe1;

public class Main {
    public static void main(String[] args) {
        SeqFile ProteaseSeq = new SeqFile("data/protease_sequences.fasta");
        System.out.println(ProteaseSeq.isValid());
        System.out.println("Anzahl an Sequenzen: " + ProteaseSeq.getNumberOfSequences());
        System.out.println("Alle Sequenzen: " + ProteaseSeq.getSequences());
        System.out.println("Erste Sequenz: " + ProteaseSeq.getFirstSequence());

    }
}

