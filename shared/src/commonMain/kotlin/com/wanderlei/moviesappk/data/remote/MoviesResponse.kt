import com.wanderlei.moviesappk.data.remote.MovieRemote

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
