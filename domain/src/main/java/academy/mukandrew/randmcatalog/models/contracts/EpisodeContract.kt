package academy.mukandrew.randmcatalog.models.contracts

abstract class EpisodeContract {
    abstract val id: Int
    abstract val name: String?
    abstract val airDate: String?
    abstract val number: String?
    abstract val characters: List<Int>?
}