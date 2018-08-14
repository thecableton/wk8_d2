package models;
import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private String ageRating;
    private Director director;
    private Genre genre;

    public Film(String title, String ageRating, Genre genre, Director director) {
        this.title = title;
        this.ageRating = ageRating;
        this.director = director;
        this.genre = genre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "age_rating")
    public String getAgeRating() {
        return ageRating;
    }
    @Enumerated(value = EnumType.STRING)
    @Column(name = "genre")
    public Genre getGenre() {
        return genre;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
