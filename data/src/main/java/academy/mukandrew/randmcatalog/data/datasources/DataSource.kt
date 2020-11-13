package academy.mukandrew.randmcatalog.data.datasources

abstract class DataSource {
    abstract fun find(ids: List<Int>)
    abstract fun list(pageNumber: Int)
    abstract fun search(map: Map<String, Any>)
    abstract fun save()
}