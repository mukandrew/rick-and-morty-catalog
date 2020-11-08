package academy.mukandrew.randmcatalog.domain.models.entities

import academy.mukandrew.randmcatalog.domain.enums.CharacterStatus
import academy.mukandrew.randmcatalog.domain.enums.Gender
import academy.mukandrew.randmcatalog.domain.models.contracts.CharacterContract

data class CharacterEntity(
    override val id: Int,
    override val name: String,
    override val status: CharacterStatus,
    override val species: String,
    override val type: String,
    override val gender: Gender,
    override val origin: Any,
    override val location: Any,
    override val image: String,
    override val episodes: List<Int>
) : CharacterContract()