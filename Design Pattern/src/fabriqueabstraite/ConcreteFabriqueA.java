package fabriqueabstraite;

/**
 * Implémente l'interface "AbstractFabrique".
 */
public class ConcreteFabriqueA implements AbstractFabrique {

    /**
     * La méthode de création instancie un objet "ClasseA".
     *
     * @return Un objet "ClasseA" qui vient d'être créé.
     */
    public AbstractClasse creerClasse() {
        return new ClasseA();
    }
}
