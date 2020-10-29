package academy.mukandrew.randmcatalog.domain.models

data class Location(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: List<String>
)