package academy.mukandrew.randmcatalog.domain.models.search

interface SearchInterface {
    fun hasValidField(): Boolean
    fun toMap(): Map<String, Any>
}