package academy.mukandrew.randmcatalog.domain.models.contracts

import academy.mukandrew.randmcatalog.domain.enums.CharacterStatus
import academy.mukandrew.randmcatalog.domain.enums.Gender

abstract class CharacterContract {
    abstract val id: Int
    abstract val name: String
    abstract val status: CharacterStatus
    abstract val species: String
    abstract val type: String
    abstract val gender: Gender
    abstract val origin: Any
    abstract val location: Any
    abstract val image: String
    abstract val episodes: List<Int>
}