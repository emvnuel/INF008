package io.github.emvnuel.musicstore;

import java.util.Scanner;

public class TestMusicStore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE A HORA DE ABERTURA:");
        int openTime = sc.nextInt();

        System.out.println("DIGITE A HORA DE FECHAMENTO:");
        int closeTime = sc.nextInt();

        MusicStore musicStore = new MusicStore();
        musicStore.setOwner("Carlos");
        musicStore.setOpenTime(openTime);
        musicStore.setCloseTime(closeTime);

        MusicTitle mt1 = new MusicTitle();
        mt1.setTitle("A Festa");
        mt1.setArtist("Ivete Sangalo");

        MusicTitle mt2 = new MusicTitle();
        mt2.setTitle("Luna Nueva");
        mt2.setArtist("Diego Torres");

        MusicTitle[] titles = new MusicTitle[2];
        titles[0] = mt1;
        titles[1] = mt2;

        musicStore.setTitles(titles);

        System.out.println(musicStore);
        musicStore.displayHoursOfOperation();
        musicStore.displayMusicTitles();

        sc.close();
    }
}
