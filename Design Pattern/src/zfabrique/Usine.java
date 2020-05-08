/**
 * Copyright : Mathieu G. - http://www.design-patterns.fr
 * Licence : GNU General Public License v3 ou ultérieure, voir http://www.gnu.org/licenses/
 */
package zfabrique;

// Usine abstraite qui sert de base aux usines concrètes.
public abstract class Usine 
{
	// Méthode qui permet de former les unités.
	public Unite formerUnite(TypeUnite type)
	{
		Unite unite = this.creerUnite(type);
		unite.consommerRessource();
		unite.equiper();
		return unite;
	}
	
	// La création d'une unité est déléguée aux sous classes.
	public abstract Unite creerUnite(TypeUnite type);
}
