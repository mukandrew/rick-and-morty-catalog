package academy.mukandrew.randmcatalog.models.builders.search

class SearchLocation private constructor(
    private val name: String? = null,
    private val type: String? = null,
    private val dimension: String? = null,
) : SearchInterface {
    companion object {
        private const val QUERY_NAME = "name"
        private const val QUERY_TYPE = "type"
        private const val QUERY_DIMENSION = "dimension"
    }

    override fun hasValidField(): Boolean {
        return (!name.isNullOrEmpty() && !name.isNullOrBlank()) ||
                (!type.isNullOrEmpty() && !type.isNullOrBlank()) ||
                (!dimension.isNullOrEmpty() && !dimension.isNullOrBlank())
    }

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().apply {
            name?.also { this[QUERY_NAME] = it }
            type?.also { this[QUERY_TYPE] = it }
            dimension?.also { this[QUERY_DIMENSION] = it }
        }
    }

    class Builder {
        var name: String? = null
            private set
        var type: String? = null
            private set
        var dimension: String? = null
            private set

        fun name(_name: String): Builder {
            return this.apply { name = _name }
        }

        fun type(_type: String): Builder {
            return this.apply { type = _type }
        }

        fun dimension(_dimension: String): Builder {
            return this.apply { dimension = _dimension }
        }

        fun build(): SearchLocation {
            return SearchLocation(name, type, dimension)
        }
    }
}