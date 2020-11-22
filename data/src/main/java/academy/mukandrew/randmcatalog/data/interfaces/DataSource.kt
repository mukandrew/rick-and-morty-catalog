package academy.mukandrew.randmcatalog.data.interfaces

interface DataSource<RESPONSE> {
    suspend fun find(ids: List<Int>): RESPONSE
    suspend fun list(pageNumber: Int): RESPONSE
    suspend fun search(map: Map<String, String>): RESPONSE
    suspend fun save() {}
}