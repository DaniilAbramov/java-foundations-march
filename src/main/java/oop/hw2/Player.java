package oop.hw2;

public class Player {
    public static void main(String[] args) {
        Song num1 = new Song("SongFirst","Singer1",1990);

        System.out.println("num1.getSongsName() = " + num1.getSongsName());
        num1.setSongsName("SongSong");
        System.out.println("num1 new SongsName() = " + num1.getSongsName());

        System.out.println("num1.getSinger() = " + num1.getSinger());
        num1.setSinger("SingerSinger");
        System.out.println("num1 new Singer() = " + num1.getSinger());

        System.out.println("num1.getYearRelease() = " + num1.getYearRelease());
        num1.setYearRelease(2000);
        System.out.println("num1 new YearRelease() = " + num1.getYearRelease());


//        Song emptySong = new Song();

    }
}
