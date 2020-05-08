package fabriqueabstraite;

/**
 * Sous classe de AbstractClasse
 * Cette classe est instanciée par ConcreteFabriqueA
 */
public class ClasseA implements AbstractClasse {

    /**
     * Implémentation de la méthode d'affichage
     */
    public void afficherClasse() {
        System.out.println("Objet de classe 'ClasseA'");
    }
}
