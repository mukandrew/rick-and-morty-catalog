package academy.mukandrew.randmcatalog.models.contracts

import academy.mukandrew.randmcatalog.enums.CharacterStatus
import academy.mukandrew.randmcatalog.enums.Gender

abstract class CharacterContract {
    abstract val id: Int
    abstract val name: String?
    abstract val status: CharacterStatus?
    abstract val species: String?
    abstract val type: String?
    abstract val gender: Gender?
    abstract val origin: LocationContract?
    abstract val location: LocationContract?
    abstract val image: String?
    abstract val episodes: List<Int>?
}