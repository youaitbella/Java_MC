package fabriqueabstraite;

/**
 * Sous classe de AbstractClasse
 * Cette classe est instanciée par ConcreteFabriqueB
 */
public class ClasseB implements AbstractClasse {

    /**
     * Implémentation de la méthode d'affichage
     */
    public void afficherClasse() {
        System.out.println("Objet de classe 'ClasseB'");
    }
}
