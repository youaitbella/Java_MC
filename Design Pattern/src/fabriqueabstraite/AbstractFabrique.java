package fabriqueabstraite;

/**
 * Définit l'interface de la méthode de création.
 */
public interface AbstractFabrique {

    /**
     * Méthode de création d'un objet de classe AbstractClasse.
     *
     * @return L'objet créé.
     */
    public AbstractClasse creerClasse();
}
