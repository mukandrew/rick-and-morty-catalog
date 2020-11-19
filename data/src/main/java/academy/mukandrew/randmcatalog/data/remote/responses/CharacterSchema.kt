package academy.mukandrew.randmcatalog.data.remote.responses

import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterSchema(
    val id: Int,
    val name: String? = null,
    val status: String? = null,
    val species: String? = null,
    val type: String? = null,
    val gender: String? = null,
    val origin: LocationSchema? = null,
    val location: LocationSchema? = null,
    val image: String? = null,
    val episodes: List<String>? = null,
) : BaseSchema()