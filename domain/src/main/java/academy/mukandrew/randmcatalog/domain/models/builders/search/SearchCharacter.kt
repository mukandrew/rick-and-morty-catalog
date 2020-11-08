package academy.mukandrew.randmcatalog.domain.models.builders.search

import academy.mukandrew.randmcatalog.domain.enums.CharacterStatus
import academy.mukandrew.randmcatalog.domain.enums.Gender

class SearchCharacter private constructor(
    private val name: String? = null,
    private val status: CharacterStatus? = null,
    private val species: String? = null,
    private val type: String? = null,
    private val gender: Gender? = null
) : SearchInterface {

    companion object {
        private const val QUERY_NAME = "name"
        private const val QUERY_STATUS = "status"
        private const val QUERY_SPECIES = "species"
        private const val QUERY_TYPE = "type"
        private const val QUERY_GENDER = "gender"
    }

    override fun hasValidField(): Boolean {
        return (!name.isNullOrEmpty() && !name.isNullOrBlank()) ||
                (status != null) ||
                (!species.isNullOrEmpty() && !species.isNullOrBlank()) ||
                (!type.isNullOrEmpty() && !type.isNullOrBlank()) ||
                (gender != null)
    }

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().apply {
            name?.also { this[QUERY_NAME] = it }
            status?.also { this[QUERY_STATUS] = it.value }
            species?.also { this[QUERY_SPECIES] = it }
            type?.also { this[QUERY_TYPE] = it }
            gender?.also { this[QUERY_GENDER] = it.value }
        }
    }

    class Builder {
        var name: String? = null
            private set
        var status: CharacterStatus? = null
            private set
        var species: String? = null
            private set
        var type: String? = null
            private set
        var gender: Gender? = null
            private set

        fun name(_name: String) {
            name = _name
        }

        fun status(_status: CharacterStatus) {
            status = _status
        }

        fun species(_species: String) {
            species = _species
        }

        fun type(_type: String) {
            type = _type
        }

        fun gender(_gender: Gender) {
            gender = _gender
        }

        fun build(): SearchCharacter {
            return SearchCharacter(name, status, species, type, gender)
        }
    }
}