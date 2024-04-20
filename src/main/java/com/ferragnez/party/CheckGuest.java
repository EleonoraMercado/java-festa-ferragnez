package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nel programma bisogna creare e inizzializzarel'array contenente nomi degli invitati, chiedere all'utente
		//come si chiama e verificare che il nome sia presente nella lista; lasciarlo entrare o mandarlo via.
		//Bonus: svolgere sia con ciclo for che con ciclo while.
		//Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-AX, Francesco Totti, Ilary Blasi, Bebe Vio,
		//Luis, Martina Maccherone, Rachel Zeilic.
				
				
		String [] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-AX", "Francesco Totti", "Ilary Blasi", 
						"Bebe Vio", "Luis", "Martina Maccherone", "Rachel Zeilic"};
		
		
		System.out.println("Verra effettuata una ricerca nella lista degli invitati" + " Entrerai solamete se sei dentro la lista");
				
		System.out.println("Inserisci il tuo nominativo");
		
		Scanner scan = new Scanner(System.in);
		String nomeDaVerificare = scan.nextLine();
		
		for(int i = 0; i < listaInvitati.length; i++) {
			if (listaInvitati[i].equalsIgnoreCase(nomeDaVerificare)) {
				System.out.println("Benvenuto al party Ferragnez " + nomeDaVerificare + "!");
					scan.close();
					return;
			} 
		}
			
			System.out.println("Mi dispiace, " + nomeDaVerificare + " non ti si caga nessuno, torna da dove sei venuto!");
				scan.close();
				
	}

	};
