package com.example.hodgepodge.outward;

/**
 * @author yangpeng
 * @Classname CinemaClient
 * @Description TODO
 * @Date 2020/12/5 1:07 上午
 */
public class CinemaClient {
    public static void main(String[] args) {
        MovieTheater movieTheater = new MovieTheater();
        movieTheater.MovieBegins();
        System.out.println("--------------------");
        movieTheater.movieEnd();
    }
}
