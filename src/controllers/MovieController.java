package controllers;

import models.Movie;

public class MovieController {

    /**
     * Ordena el arreglo de películas por título en orden ascendente
     * usando Selection Sort.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {

        for (int i = 0; i < movies.length - 1; i++) {
            int aux1 = i;
            for (int j = i + 1; j < movies.length; j++) {
                if (movies[j].getTitle().compareTo(movies[aux1].getTitle()) < 0) {
                    aux1 = j;
                }
            }
            Movie aux = movies[i];
            movies[i] = movies[aux1];
            movies[aux1] = aux;
        }
    }
}