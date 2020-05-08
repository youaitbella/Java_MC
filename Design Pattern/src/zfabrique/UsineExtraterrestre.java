/**
 * Copyright : Mathieu G. - http://www.design-patterns.fr
 * Licence : GNU General Public License v3 ou ultérieure, voir http://www.gnu.org/licenses/
 */
package zfabrique;

// Usine extraterrestre.
public class UsineExtraterrestre extends Usine
{
	// Méthode qui permet de créer des unités extraterrestres.
	public Unite creerUnite(TypeUnite type)
	{
		Unite unite = null;;
		switch(type)
		{
			case SOLDAT:unite = new SoldatExtraterrestre();break;
			case COMMANDANT:unite = new CommandantExtraterrestre();break;
		}
		return unite;
	}
}
