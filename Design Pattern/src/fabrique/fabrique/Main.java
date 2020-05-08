/**
 * Copyright : Mathieu G. - http://www.design-patterns.fr
 * Licence : GNU General Public License v3 ou ultérieure, voir http://www.gnu.org/licenses/
 */
package fabrique.fabrique;

// Classe principale du projet.
public class Main 
{
	// Méthode principale.
	public static void main(String[] args) 
	{
		Usine usineExtraterrestre = new UsineExtraterrestre();
		Unite unite = usineExtraterrestre.formerUnite(TypeUnite.SOLDAT);
		System.out.println(unite);
	}

}
