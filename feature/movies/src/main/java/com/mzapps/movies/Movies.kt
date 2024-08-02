package com.mzapps.movies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mzapps.model.Movie
import com.mzapps.ui.MoviesAndShowsTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun Movies(
    movies: ImmutableList<Movie>,
    modifier: Modifier = Modifier
) {
    LazyColumn {
        items(movies.size) {
            MovieCard(
                movie = movies[it],
                modifier
            )
        }
    }
}

@Composable
fun MovieCard(
    movie: Movie,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = movie.thumbnailUrl,
                contentDescription = movie.name,
                modifier = modifier.size(80.dp)
            )
            Spacer(modifier = modifier.width(16.dp))
            Column {
                Text(movie.name, style = MaterialTheme.typography.bodyLarge)
                Text("(${movie.year})", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MoviePreview() {
    MoviesAndShowsTheme {
        MovieCard(
            Movie(
                id = "1",
                name = "My Big Fat Greek Wedding",
                thumbnailUrl = "https://m.media-amazon.com/images/M/MV5BNzcwOWU4NGEtYjUyMy00MDNlLThiN2MtYzFlMjk4Y2FhNjlmXkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_FMjpg_UX400_.jpg",
                year = 2023,
                5
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MoviesListPreview() {
    MoviesAndShowsTheme {
        Movies(
            persistentListOf(
                Movie(
                    id = "1",
                    name = "My Big Fat Greek Wedding",
                    thumbnailUrl = "https://m.media-amazon.com/images/M/MV5BNzcwOWU4NGEtYjUyMy00MDNlLThiN2MtYzFlMjk4Y2FhNjlmXkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_FMjpg_UX400_.jpg",
                    year = 2023,
                    5
                ),
                Movie(
                    id = "1",
                    name = "My Big Fat Greek Wedding 2",
                    thumbnailUrl = "https://m.media-amazon.com/images/M/MV5BNzcwOWU4NGEtYjUyMy00MDNlLThiN2MtYzFlMjk4Y2FhNjlmXkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_FMjpg_UX400_.jpg",
                    year = 2023,
                    5
                ),
                Movie(
                    id = "1",
                    name = "My Big Fat Greek Wedding 3",
                    thumbnailUrl = "https://m.media-amazon.com/images/M/MV5BNzcwOWU4NGEtYjUyMy00MDNlLThiN2MtYzFlMjk4Y2FhNjlmXkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_FMjpg_UX400_.jpg",
                    year = 2023,
                    5
                )
            )
        )
    }
}