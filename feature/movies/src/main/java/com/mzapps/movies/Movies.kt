package com.mzapps.movies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mzapps.data.Movie
import com.mzapps.ui.MoviesAndShowsTheme
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.immutableListOf

@Composable
fun Movies(
    movies: ImmutableList<Movie>,
    modifier: Modifier = Modifier
) {
    LazyColumn {
        items(movies.size) {
            Movie(
                movie = movies[it]
            )
        }
    }
}

@Composable
private fun Movie(
    movie: Movie
) {
    Row(
        modifier = Modifier.fillMaxWidth().background(Color.Cyan)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
private fun MoviePreview() {
    MoviesAndShowsTheme {
        Movie(
            Movie(
                id = "",
                name = "dslj",
                thumbnail = "",
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
            immutableListOf()
        )
    }
}

