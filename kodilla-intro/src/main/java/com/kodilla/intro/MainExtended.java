package com.kodilla.intro;

public class MainExtended {
    public static void main(String[] args) {
        String netflixSeries = "Homeland";
        int seasonNumber = 3;
        int episodeNumber = 18;
        double episodeTime = 33.30;
        char rating = 'A';
        String comment = "dobry epizod";

        System.out.println(netflixSeries + "\n" + seasonNumber + "\n" + episodeNumber + "\n" + episodeTime + "\n" + rating + " - " + comment );
        System.out.println("\n");

        //lub każda z lini oddzielnie

        System.out.println(netflixSeries);
        System.out.println(seasonNumber);
        System.out.println(episodeNumber);
        System.out.println(episodeTime);
        System.out.println(rating);
        System.out.println(comment);
    } }
