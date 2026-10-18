Esercizio 2: Reclutamento Supereroi (Datafaker)
Simulare un reclutamento per missioni usando una libreria Maven esterna.
Dipendenza Maven: aggiungi net.datafaker:datafaker al file pom.xml.
EroeNonIdoneoException (Checked): estende Exception. Viene lanciata se il livello di potere dell'eroe è insufficiente. Salva nome dell'eroe e livello.
Classe Reclutatore: usa Datafaker per generare un nome da supereroe e un potere casuale (da 1 a 100). Confronta il potere con la difficoltà richiesta dalla missione.
Classe Main: imposta una missione con difficoltà 75 ed esegui un ciclo di 5 tentativi di reclutamento. Cattura l'eccezione se l'eroe è troppo debole e passa al candidato successivo senza bloccare il programma.