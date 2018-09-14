package com.example.jessie.rjt_cw_9_13_recycle_view;

public class Movie {

    String sTitle;
    String sGenre;
    String sYear;

    public Movie()
    {
    }

    public Movie(String title, String genre, String Year)
    {
        this.sTitle = title;
        this.sGenre = genre;
        this.sYear = Year;
    }


    public String getsGenre() {
        return sGenre;
    }

    public void setsGenre(String sGenre) {
        this.sGenre = sGenre;
    }

    public String getsYear() {
        return sYear;
    }

    public void setsYear(String sYear) {
        this.sYear = sYear;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + sTitle + '\'' +
                ", genre='" + sGenre + '\'' +
                ", year='" + sYear + '\'' +
                '}';
    }
}
