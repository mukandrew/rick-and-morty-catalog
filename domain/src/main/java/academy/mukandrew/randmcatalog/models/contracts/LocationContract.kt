package academy.mukandrew.randmcatalog.models.contracts

abstract class LocationContract {
    abstract val id: Int
    abstract val name: String?
    abstract val type: String?
    abstract val dimension: String?
    abstract val residents: List<String>?
    abstract val url: String?
}