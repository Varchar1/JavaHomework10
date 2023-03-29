public class AfishaManager {

    private Afisha[] films = new Afisha[0];
    private int limit = 5;

    public AfishaManager() {

    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public void save(Afisha film) {
        Afisha[] tmp = new Afisha[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Afisha[] findAll() {
        return films;
    }

    public Afisha[] findLast() {
        int resultLength = limit;
        if (resultLength > films.length) {
            resultLength = films.length;
        }
        Afisha[] reversed = new Afisha[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }
}
