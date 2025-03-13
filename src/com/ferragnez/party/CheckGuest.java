package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    String [] arrayInvitati = {
        "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", 
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", 
        "Rachel Zeilic"
    };
   
    System.out.print("Inserisci il tuo nome ");
    String nomeInserito = in.nextLine();
    System.out.println("il nome inserito è " + nomeInserito);
     in.close();
    boolean isInList = false;
    int i = 0;
    while( !isInList && i < arrayInvitati.length ){
        System.out.println(arrayInvitati[i].toLowerCase());
        
if(arrayInvitati[i].toLowerCase().equals(nomeInserito.toLowerCase())){
    isInList = true;
} else {  i++;
}
}
if (isInList) { System.out.print("il nome inserito è nella lista ");

} else{ System.out.print("il nome inserito non è nella lista");  }
}
}

// per fare questo esercizio con il ciclo for possiamo utilizzare !isInList nella condizione del ciclo 

// boolean isInList = false;
// for (int i = 0 ; !isInList && i < arrayInvitati.length; i++ ){
//     if(arrayInvitati[i].equals(nomeInserito)){
//         isInList = true;
//     }
//     if (isInList) { System.out.print("il nome inserito è nella lista ");

// } else{ System.out.print("il nome inserito non è nella lista");  }
// }
// }
