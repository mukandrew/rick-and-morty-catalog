package academy.mukandrew.randmcatalog.data.remote.services

import academy.mukandrew.randmcatalog.data.remote.responses.CharacterSchema
import academy.mukandrew.randmcatalog.data.remote.responses.PageSchema
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap
import retrofit2.http.QueryName

interface CharacterService {
    companion object {
        private const val BASE_PATH = "character/"
        private const val ID_PATH_NAME = "id"
        private const val FIND_PATH = "$BASE_PATH/{$ID_PATH_NAME}"
        private const val SEARCH_PATH = "$BASE_PATH?"
    }

    @GET(BASE_PATH)
    suspend fun listPage(@QueryName page: Int): Response<PageSchema<CharacterSchema>>

    @GET(FIND_PATH)
    suspend fun find(@Path(ID_PATH_NAME) id: String): Response<CharacterSchema>

    @GET(FIND_PATH)
    suspend fun findMulti(@Path(ID_PATH_NAME) id: String): Response<List<CharacterSchema>>

    @GET(SEARCH_PATH)
    suspend fun search(@QueryMap params: Map<String, String>): Response<PageSchema<CharacterSchema>>
}