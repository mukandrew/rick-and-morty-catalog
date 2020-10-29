package academy.mukandrew.randmcatalog.domain.models

data class Character(
    val id: Int,
    val name: String,
    val status: CharacterStatus,
    val species: String,
    val type: String,
    val gender: Gender,
    val origin: Any,
    val location: Any,
    val image: String,
    val episodes: List<Int>
)