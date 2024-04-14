package com.oopsConcepts.Interface;

public class MovieTestExecution extends ImplementTest {
    public static void main(String[] args) {
        //grandparent                        grand child
        BookMovieTickets bookMovieTickets = new MovieTestExecution();

        bookMovieTickets.login();
        bookMovieTickets.searchMovie();
        bookMovieTickets.bookTickets();
        bookMovieTickets.completePayments();

    }
}
