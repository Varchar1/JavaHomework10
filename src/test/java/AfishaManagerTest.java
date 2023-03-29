import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    Afisha film1 = new Afisha("Бладшот");
    Afisha film2 = new Afisha("Вперед");
    Afisha film3 = new Afisha("Отель Белград");
    Afisha film4 = new Afisha("Джентельмены");
    Afisha film5 = new Afisha("Человек-невидимка");
    Afisha film6 = new Afisha("Тролли");
    Afisha film7 = new Afisha("Номер один");

    @Test
    public void findAllTest() {
        AfishaManager manager = new AfishaManager();
        manager.save(film1);
        manager.save(film5);
        manager.save(film2);

        Afisha[] expected = {film1, film5, film2};
        Afisha[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastDefaultLimit() {
        AfishaManager manager = new AfishaManager();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);

        Afisha[] expected = {film7, film6, film5, film4, film3};
        Afisha[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastThreeFilms() {
        AfishaManager manager = new AfishaManager(3);
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);

        Afisha[] expected = {film7, film6, film5};
        Afisha[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void findLastTwentyFilms() {
        AfishaManager manager = new AfishaManager(20);
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);

        Afisha[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Afisha[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
}
