package io.github.emvnuel.musicstore;

import java.time.LocalTime;

public class MusicStore {

    private String owner;
    private Integer openTime;
    private Integer closeTime;
    private MusicTitle[] titles;


    public MusicStore() {
        owner = "sem dono";
        openTime = 9;
        closeTime = 21;
        titles = null;
    }

    public void displayHoursOfOperation() {
        System.out.println(getOpenClosedMessage());
        System.out.println("Período:\nDiariamente das "+openTime+":00 - "+getCloseTime()+":00\n");
        System.out.println(owner+ ", Proprietário");
    }

    public void displayMusicTitles() {
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Título "+(i+1)+":");
            System.out.println("Título: "+ titles[i].getTitle());
            System.out.println("Artista: "+ titles[i].getArtist()+"\n");

        }
    }

    private String getOpenClosedMessage() {
        return isOpen() ? "Estamos Abertos!" : "Estamos Fechados!";
    }

    private boolean isOpen() {
        return getHourInt() >= openTime &&  getHourInt() <= closeTime;
    }

    private int getHourInt() {
        return LocalTime.now().getHour();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public MusicTitle[] getTitles() {
        return titles;
    }

    public void setTitles(MusicTitle[] titles) {
        this.titles = titles;
    }


    @Override
    public String toString() {
        return "MusicStore{" +
                "Dono='" + owner + '\'' +
                ", Abre=" + openTime +
                ", Fecha=" + closeTime +
                '}';
    }
}
