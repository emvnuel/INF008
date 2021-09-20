package io.github.emvnuel.musicstore;

public class MusicTitle {

    private String title;
    private String artist;

    public MusicTitle() {
        title = "sem nome";
        artist = "sem nome";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
