package Taxation;

import java.util.ArrayList;
import java.util.Iterator;

public class Principale {

	public Principale() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
Fiche f1 = new Fiche( "12-10-2008", "Auto", 125.00d );
Fiche f2 = new Fiche( "16-10-2008", "mm", 120.00d );		
		f1.getFiche();
	
		
		
		
		
		
/*Fiche f1 = new Fiche( "12-10-2008", "Auto", 125.00d );
Fiche f2 = new Fiche( "16-10-2008", "mm", 120.00d );
		
		/*f1.getFiche();*/

	/*	ArrayList<Fiche> table= new ArrayList<Fiche>();
		
		table.add(f1);
		table.add(f2);
		
		for (int j = 0; j< table.size(); j++) {((Fiche) table.get(j)).getFiche();}Fiche f2 = new Fiche( "16-10-2008", "mm", 120.00d );*/
		/*table.get(0);
		table.get(0).getFiche();
		table.get(1);
		table.get(1).getFiche();Fiche f2 = new Fiche( "16-10-2008", "mm", 120.00d );
		
		/*for (int i = 0; i < table.size(); i++) {
		      table.get(i).getFiche();
		}*/
		
		 /*Iterator i =table.iterator();
			
			while (i.hasNext()) { System.out.println(i.next()); }
		

		
		
		
	/*	Remise remise= new Remise(100,1,"2021");
		 
		 remise.addRevenus("2021-01-12","Castilliano", 650.00d);
		 remise.addDepenses("2021-01-15","AutoDec", 210.50d);
		 remise.addDepenses("2021-02-17","Noranda", 1020.00d);
		 remise.addDepenses("2021-02-17","Aérobec", 125.00d);
		 remise.addDepenses("2021-03-23","Gill et son", 50.00d);
		 
		/* remise.addDepenses("2021-01-12","Auto", 459.00d);
		 remise.addDepenses("2021-01-15","Resto", 19.95d);
		 remise.addDepenses("2021-02-17","Matériel", 210.00d);
		 remise.addDepenses("2021-02-17","Auto", 77.00d);
		 remise.addDepenses("2021-03-23","Resto", 38.00d);
		 
		 System.out.println(remise);
		
*/

		
		
	
			/*	Liste liste = new Liste();
				
			
				// Ajout de factures ==============================================
				liste.insert("2021-01-04", "Auto", 100.00d);
				liste.insert("2021-02-08", "maison",50.00d);
				liste.insert("2021-03-04", "electricite", 525.00d);
			
			
	
				
	/*	ArrayList<Fiche> liste = new ArrayList<Fiche>(10);
		
		Fiche f1= new Fiche ("2021-01-04", "Auto", 100.00d);
		Fiche f2= new Fiche ("2022-01-04", "puto", 500.00d);
		Fiche f3= new Fiche("2021-03-04", "electricite", 525.00d);
		liste.add(f1);
		liste.add(f2);
		liste.add(f3);
		
		 
		   Iterator i =liste.iterator();
			
					while (i.hasNext()) { System.out.println(i.next()); }

			
/*
				// Compte rendu des factures
				System.out.println("#     Date     Montant      TPS         TVQ          Total ");
				System.out.println("=========================================================================\n");
				System.out.println(liste);
				System.out.println(liste);
		liste.getRapport();
		
		
/*Fiche f1 = new Fiche( "12-10-2008", "Auto", 125.00d );
		
		f1.getFiche();*/
		
		
		/*Liste liste = new Liste(100);
		
		
		
		liste.insert("2002", "auto", 100.00d);
		liste.insert("10007", "James Bond", 50.00d);
		
	
		System.out.println("Listes des fiches================================\n");
		
		
		liste.getRapport();*/

	} // main
		

	


}