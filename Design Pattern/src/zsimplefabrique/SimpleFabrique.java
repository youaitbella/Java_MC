/**
 * Copyright : Mathieu G. - http://www.design-patterns.fr
 * Licence : GNU General Public License v3 ou ultérieure, voir http://www.gnu.org/licenses/
 */
package zsimplefabrique;

// Classe permettant de fabriquer une unité.
public class SimpleFabrique 
{
	// La création d'une unité en fonction de son type est encapsulée dans la fabrique.
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
