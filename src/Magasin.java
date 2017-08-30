
		// Cr�ation d'une structure -sans fonction - dans le contexte de la classe utilisateur
	class Facture //instanciation ( une classe est tj vide)
	{
		float[] listeAchats = new float[5];
		float sousTotal;
		float tps;
		float tvq;
		float total;
	}
public class Magasin 
{		
	public static void main(String[] args) {
		
		// Ce n'etait que sa recette, aucun espace m�moire n'est utilis� avec juste ceci
		Facture factureDuLundi = new Facture(); // on cr�e pour vrai les variables de la recettes (listeAchats, sousTotal, tps, tpq, total)
		
		float tpsLundi = factureDuLundi.tps; // Lecture l'objet  et remplissage de tpsMardi par factureDuMardi.tps
		factureDuLundi.tps = 5f;//Ecriture dans facture du mardi
		
		// Facture.tps = incorrect car la facture ne reserve pas d'espace
		// factureDuLundi.tps = 5f; correct
		
		
		Facture factureDuMardi = new Facture(); // instanciation    creer un objet 
		float tpsMardi = factureDuMardi.tps; //
		factureDuMardi.listeAchats = lireAchats(); // dans l'objet qui est du type de la classe aui est de la sorte facture aue j4ecrase et aue je met le tableau
		factureDuMardi = preparerFacture(factureDuMardi);
		afficherFacture(factureDuMardi);
	}
	
	
	public static Facture preparerFacture(Facture facture )
	{
		facture.sousTotal = calculerSommePrix(facture.listeAchats);
		facture.tps = calculerTaxeFederale(facture.sousTotal);
		facture.tvq = calculerTaxeProvincial(facture.sousTotal);
		facture.total = facture.sousTotal + facture.tps + facture.tvq;		
		return facture;
	}
	
	public static float [] lireAchats()
	{
		float [] listeAchats = new float [5];
		listeAchats [0] = 2.7f;
		listeAchats [1] = 6f;
		listeAchats [2] = 8.2f;
		listeAchats [3] = 4.25f;
		listeAchats [4] = 1.0f;
		
		return listeAchats;
		//faire un return avec les valeurs de dans 
	}
	
	public static void afficherFacture(Facture facture)
	{
		for(int numeroAchat = 0; numeroAchat < facture.listeAchats.length;numeroAchat++ )
		{
			float achat = facture.listeAchats[numeroAchat];
			System.out.println(achat);
		}
		System.out.println("--------------------------");
		System.out.println("Sous-Total:" + facture.sousTotal + "$");
		System.out.println("TPS:" + facture.tps + "$");
		System.out.println("TVQ:" + facture.tvq + "$");
		System.out.println("--------------------------");
		System.out.println("Total:" + facture.total + "$");
	}
	public static float calculerSommePrix(float [] listePrix)
	{
		float somme = 0;
		
		for(int position = 0; position < listePrix.length; position++)
		{
			somme += listePrix[position];
		}
		
		return somme;
	}
	
	public static float calculerTaxeFederale(float montant)
	{
		return montant = 0.05f;
	}
	
	public static float calculerTaxeProvincial(float montant)
	{
		return montant = 0.09975f;
	}
	
	public static final int FACTURE_SOUS_TOTAL = 0; //final reserve une plage en memoire pour la variable et elle ne peux etre modifier.
	public static final int FACTURE_TPS = 1;
	public static final int FACTURE_TPQ = 2;
	public static final int FACTURE_TOTAL = 3; 
}