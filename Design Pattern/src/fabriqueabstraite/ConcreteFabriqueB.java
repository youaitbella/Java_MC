package fabriqueabstraite;

/**
 * Implémente l'interface "AbstractFabrique".
 */
public class ConcreteFabriqueB implements AbstractFabrique {

    /**
     * La méthode de création instancie un objet "ClasseB".
     *
     * @return Un objet "ClasseB" qui vient d'être créé.
     */
    public AbstractClasse creerClasse() {
        return new ClasseB();
    }
}
