package academy.mukandrew.randmcatalog.models.builders.search

class SearchEpisode private constructor(
    private val name: String? = null,
    private val episode: Int? = null
) : SearchInterface {

    companion object {
        private const val QUERY_NAME = "name"
        private const val QUERY_EPISODE = "episode"
    }

    override fun hasValidField(): Boolean {
        return (!name.isNullOrEmpty() && !name.isNullOrBlank()) || (episode != null)
    }

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().apply {
            name?.also { this[QUERY_NAME] = it }
            episode?.also { this[QUERY_EPISODE] = it }
        }
    }

    class Builder {
        var name: String? = null
            private set
        var episode: Int? = null
            private set

        fun name(_name: String): Builder {
            return this.apply { name = name }
        }

        fun episode(_episode: Int): Builder {
            return this.apply { episode = _episode }
        }

        fun builder(): SearchEpisode {
            return SearchEpisode(name, episode)
        }
    }
}