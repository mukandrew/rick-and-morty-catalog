package academy.mukandrew.randmcatalog.models.builders.search

interface SearchInterface {
    fun hasValidField(): Boolean
    fun toMap(): Map<String, Any>
}