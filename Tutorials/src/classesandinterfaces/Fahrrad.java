package classesandinterfaces;

class Fahrrad implements Drivable {

    double tempo = 0;

    @Override
    public void beschleunigen(double faktor) {
        if (faktor < 0) {
            return;
        }
        tempo += faktor * 1.5;
        tempo = tempo > 50 ? 50 : tempo;
        System.out.println("Tempo des fahrrads: " + tempo);
    }

    @Override
    public void verzoegern(double faktor) {
        if (faktor < 0) {
            return;
        }
        tempo -= faktor * 1.2;
        tempo = tempo < 0 ? 0 : tempo;
        System.out.println("Tempo des Fahrrads: " + tempo);
    }
}
