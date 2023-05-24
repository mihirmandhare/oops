package com.exam2;

class VideoTape {
    protected String title;
    protected int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + title + " - Duration: " + duration + " minutes");
    }

    public void stop() {
        System.out.println("Stopping " + title);
    }
}

class Movie extends VideoTape {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    public void displayInfo() {
        System.out.println("Movie Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public void displayInfo() {
        System.out.println("Music Video Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Artist: " + artist);
    }
}

public class Video {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, "Christopher Nolan");
        movie.displayInfo();
      

        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Shape of You", 235, "Ed Sheeran");
        musicVideo.displayInfo();

    }
}
