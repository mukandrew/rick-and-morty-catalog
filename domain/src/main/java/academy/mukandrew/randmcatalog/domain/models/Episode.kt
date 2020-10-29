package academy.mukandrew.randmcatalog.domain.models

data class Episode(
    val id: Int,
    val name: String,
    val airDate: String,
    val number: String,
    val characters: List<Int>
)