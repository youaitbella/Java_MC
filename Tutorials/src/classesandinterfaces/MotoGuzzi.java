package classesandinterfaces;

class MotoGuzzi implements Drivable {

    double tempo = 0;

    @Override
    public void beschleunigen(double faktor) {
        if (faktor < 0) {
            return;
        }
        tempo += faktor * 6.3;
        tempo = tempo > 200 ? 200 : tempo;
    }

    @Override
    public void verzoegern(double faktor) {
        if (faktor < 0) {
            return;
        }
        tempo -= faktor * 4.6;
        tempo = tempo < 0 ? 0 : tempo;
    }
}
