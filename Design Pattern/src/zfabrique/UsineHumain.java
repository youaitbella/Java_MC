/**
 * Copyright : Mathieu G. - http://www.design-patterns.fr
 * Licence : GNU General Public License v3 ou ultérieure, voir http://www.gnu.org/licenses/
 */
package zfabrique;

// Usine humaine.
public class UsineHumain extends Usine
{
	// Méthode qui permet de créer des unités humaines.
	public Unite creerUnite(TypeUnite type)
	{
		Unite unite = null;;
		switch(type)
		{
			case SOLDAT:unite = new SoldatHumain();break;
			case COMMANDANT:unite = new CommandantHumain();break;
		}
		return unite;
	}
}
