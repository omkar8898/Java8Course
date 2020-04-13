package com.java8;

import java.util.function.Consumer;

import com.java8.entity.Movie;

public class ConsumerChaining {
	public static void main(String[] args) {
		
		Consumer<Movie> movieConsumer1 = movie->System.out.println("Movie:"+movie.getName()+"isreadytorelease");
		Consumer<Movie> movieConsumer2 = movie->System.out.println("Movie:"+movie.getName()+"isjustReleasedanditis:"+movie.getResult());
		Consumer<Movie> movieConsumer3 = movie->System.out.println("Movie:"+movie.getName()+"informationstoringinthedatabase");
		
		Consumer<Movie> chainedConsumer = movieConsumer1.andThen(movieConsumer2).andThen(movieConsumer3);
		
		Movie movie= new Movie("Movie1", "Hit");
		chainedConsumer.accept(movie);
		movie=new Movie("Movie2", "Flop");
		chainedConsumer.accept(movie);
		movie=new Movie("Movie3", "Flop");
		chainedConsumer.accept(movie);
	}
}
