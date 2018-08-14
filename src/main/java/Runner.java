import db.DBHelper;
import models.Director;
import models.Film;
import models.Genre;

public class Runner {

    public static void main(String[] args) {

        Director euan = new Director( "Euan");
        DBHelper.save(euan);
        Director vicky = new Director( "Vicky");
        DBHelper.save(vicky);
        Film film1 = new Film("Euan's Life Story", "PG", Genre.HORROR, euan);
        DBHelper.save(film1);
        Film film2 = new Film("Euan's Prequel Story", "PG",Genre.COMEDY, euan);
        DBHelper.save(film2);

        film1.setDirector(vicky);
        DBHelper.update(film1);

        euan.setName("Euan Cunningham");
        DBHelper.update(euan);
    }
}
