package org.htw.prog2.aufgabe1;
import org.apache.commons.cli.*;

public class HIVDiagnostics {

    /**
     * Parst die Kommandozeilenargumente. Gibt null zurück, falls:
     * <ul>
     *     <li>Ein Fehler beim Parsen aufgetreten ist (z.B. eins der erforderlichen Argumente nicht angegeben wurde)</li>
     *     <li>Bei -m, -d und -r nicht die gleiche Anzahl an Argumenten angegeben wurde</li>
     * </ul>
     * @param args Array mit Kommandozeilen-Argumenten
     * @return CommandLine-Objekt mit geparsten Optionen
     */

    public static CommandLine parseOptions(String[] args) {
        CommandLineParser parser = new DefaultParser();
        HelpFormatter helpFormatter = new HelpFormatter();

        Options options = new Options();
        Option mutationfiles = Option.builder("m").longOpt("mutationfiles").hasArg().required(true).desc("Pfad zu CSV-Datei mit Mutationspattern. Muss angegeben werden.").build();
        options.addOption(mutationfiles);
        Option drugnames = Option.builder("d").longOpt("drugnames").hasArg().required(true).desc("Name des Medikaments. Muss angegeben werden.").build();
        options.addOption(drugnames);
        Option references = Option.builder("r").longOpt("references").hasArg().required(true).desc("Pfad zu FASTA-Datei mit der Referenzsequenz. Muss angegeben werden.").build();
        options.addOption(references);
        Option patientseqs = Option.builder("p").longOpt("patientseqs").hasArg().required(true).desc("Pfad zu FASTA-Datei mit Patientensequenzen. Muss angegeben werden.").build();
        options.addOption(patientseqs);

        try {
            return parser.parse(options, args);
        } catch (ParseException e) {
            helpFormatter.printHelp("HIVDiagnostics", options);
            return null;
        }
    }



    public static void main(String[] args) {

    }
}
