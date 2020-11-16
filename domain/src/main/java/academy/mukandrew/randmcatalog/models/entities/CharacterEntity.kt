package academy.mukandrew.randmcatalog.models.entities

import academy.mukandrew.randmcatalog.enums.CharacterStatus
import academy.mukandrew.randmcatalog.enums.Gender
import academy.mukandrew.randmcatalog.models.contracts.CharacterContract

data class CharacterEntity(
    override val id: Int,
    override val name: String? = null,
    override val status: CharacterStatus? = null,
    override val species: String? = null,
    override val type: String? = null,
    override val gender: Gender? = null,
    override val origin: LocationEntity? = null,
    override val location: LocationEntity? = null,
    override val image: String? = null,
    override val episodes: List<Int>? = null,
) : CharacterContract()