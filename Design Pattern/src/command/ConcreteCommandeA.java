package command;

/**
 * Implémente une commande. Appelle la méthode action1() lorsque la commande est
 * exécutée.
 */
public class ConcreteCommandeA implements Commande {

    private Recepteur recepteur;

    public ConcreteCommandeA(Recepteur pRecepteur) {
        recepteur = pRecepteur;
    }

    public void executer() {
        recepteur.action1();
    }
}
