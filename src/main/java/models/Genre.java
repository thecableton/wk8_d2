package models;

public enum Genre {

    HORROR("Horror"),
    ACTION("Action"),
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    SCIFI("Sci-fi");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
