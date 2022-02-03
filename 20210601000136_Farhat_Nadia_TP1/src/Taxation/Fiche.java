package Taxation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fiche {

	// Constantes
			final private  double TPS = 0.05d;
			final private  double TVQ = 0.0975d;
			final private  double SANSTAXES = 1.14975d;

			// Attributs
			public  String date="2021-02-20";
			public   String poste= "Auto";
			public  double montant;
			public  double tps;
			public  double tvq;
			public  double sommeTotal=0;
			
			
			// Constructeurs
			public Fiche( String date, String poste, double montant ) {
				setDate(date);
				setPoste(poste);
				setMontant(montant);	
			} // Fiche

			// Accesseurs
					public String getDate()  { return this.date;  }
					public String getPoste() { return this.poste; }
					public double getMontant() { return this.montant;}
				
					
			// Mutateurs
					public void setDate(  String date )  { this.date  = date;}
					public void setPoste( String poste ) { this.poste = poste;}
					public void setMontant( double montant ) { this.montant = montant; }//
					
					public void setFiche(LocalDate date,String poste, double mnt )
					{DateTimeFormatter formatter_1= DateTimeFormatter.ofPattern("yyyy-mm-dd");
						this.date = date.format(formatter_1); 
						setPoste(poste);
						setMontant(montant);}
					
			// j'ai essayé de mettre un autre mutateur avec la date STring mais ca ne l'a pas fonctionné 
					/*public void setFiche(String date, String poste, double montant) {
						this.date= LocalDate.parse(date);
						this.poste=poste;
						this.montant= montant;*/
				// methode getFiche pour affichier la ligne 	
					
					public  double  getSansTaxes() {
								 return  getMontant()/SANSTAXES;}
							
							public double getTps() {
								return  getSansTaxes()* TPS;}
							
							public double getTvq() {
								return  getSansTaxes()* TVQ;}
							
					
					
					
				public String getFiche() {	
				
				
			 String fiche= String.format(" %s  %10s %10.2f %10.2f %10.2f",getDate(),getPoste(),getSansTaxes(),getTps(),getMontant());
			
			  return fiche;
				
			} // getFiche()
				
				
				
				

}
