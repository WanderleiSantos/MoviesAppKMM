package com.wanderlei.moviesappk.android.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wanderlei.moviesappk.domain.model.Movie

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    uiState: HomeScreenState,
    loadNextMovies: (Boolean) -> Unit,
    navigateToDetail: (Movie) -> Unit
) {

}