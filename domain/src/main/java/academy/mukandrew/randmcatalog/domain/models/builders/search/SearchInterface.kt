package academy.mukandrew.randmcatalog.domain.models.builders.search

interface SearchInterface {
    fun hasValidField(): Boolean
    fun toMap(): Map<String, Any>
}