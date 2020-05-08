// Auteur : Mathieu G.
// Site : http://www.design-patterns.fr
// Licence : GNU General Public License
package observeurApi;

// Affiche un résumé en console des informations (position) du GPS.
public class AfficheResume implements Observateur
{
	// Méthode appelée automatiquement lors d'un changement d'état du GPS.
	public void actualiser(Observable o) 
	{
		if(o instanceof Gps)
		{	
			Gps g = (Gps) o;
			System.out.println("Position : "+g.getPosition());
		}	
	}

}
