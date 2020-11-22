package academy.mukandrew.randmcatalog.data.remote.responses

import academy.mukandrew.randmcatalog.models.contracts.CharacterContract
import academy.mukandrew.randmcatalog.models.entities.CharacterEntity
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
    val episodes: List<String>? = null
) : BaseSchema() {
    fun toContract(): CharacterContract {
        return CharacterEntity(
            id
//            name,
//            CharacterStatus.from(status),
//            species,
//            type,
//            gender,
//            origin,
//            location,
//            image,
//            episodes
        )
    }
}