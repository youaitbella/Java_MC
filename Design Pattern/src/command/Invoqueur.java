package command;

/**
 * Déclenche les commandes.
 */
public class Invoqueur {
    // Références vers les commandes

    private Commande commandeA;
    private Commande commandeB;

    // Méthodes pour invoquer les commandes
    public void invoquerA() {
        if (commandeA != null) {
            commandeA.executer();
        }
    }

    public void invoquerB() {
        if (commandeB != null) {
            commandeB.executer();
        }
    }

    // Méthodes pour fixer les commandes
    public void setCommandeA(Commande pCommandeA) {
        commandeA = pCommandeA;
    }

    public void setCommandeB(Commande pCommandeB) {
        commandeB = pCommandeB;
    }
}
