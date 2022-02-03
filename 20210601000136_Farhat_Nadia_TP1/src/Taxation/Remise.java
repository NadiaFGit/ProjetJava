package Taxation;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Remise {

	// Attributs
	
	public  int noTrim=0;
	public  String annee;
	private int taille;
	private int nbrangs;
	private int compt1=0;
	private  int compt2=0;
	public  Liste revenus;
	public  Liste depenses;

	// Accesseurs
	public int  getNoTrim()  { return this.noTrim;  }
	public String getAnnee() { return this.annee; }
	public int getNbrangs() { return this.nbrangs; }
	
	// Mutateurs
	public void setNoTrim(  int noTrim)  { this.noTrim  = noTrim;  }
	public void setAnnee( String annee) { this.annee = annee; }
	public void setNbrangs1(int nbrangs) { this.nbrangs = nbrangs; }
	
	// Constructeurs
	public Remise( int nbrangs, int noTrim, String annee ) {
		this.setNoTrim(noTrim);
		this.setNbrangs1(nbrangs);
		this.setAnnee(annee);
	 revenus= new Liste (nbrangs,"revenus");
	 depenses= new Liste (nbrangs, "depenses");
	} // Remise
	
	// Méthodes addRevenu ============================================================================
	public void addRevenus(String date, String poste, double mnt) {
		revenus.addTransaction(date, poste, mnt);
	} // addRevenu()
	
	// Méthodes addRevenu ============================================================================
	public void addDepenses(String date, String poste, double mnt) {
		depenses.addTransaction(date, poste, mnt);
	}
	
/*	public void getRapport(){
		Iterator i = ((List) revenus).iterator();
			while (i.hasNext()) 
			{ 
				System.out.println(i.next());
			}
			
			Iterator j = ((List) depenses).iterator();
			
			while (j.hasNext()) { System.out.println(j.next()); 	}

			

		}
*/

}
