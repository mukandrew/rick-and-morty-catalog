package academy.mukandrew.randmcatalog.data.remote.datasources

import academy.mukandrew.randmcatalog.data.interfaces.DataSource
import academy.mukandrew.randmcatalog.data.remote.CharactersResponse
import academy.mukandrew.randmcatalog.data.remote.responses.CharacterSchema
import academy.mukandrew.randmcatalog.data.remote.services.CharacterService
import academy.mukandrew.randmcatalog.utils.Response
import retrofit2.Retrofit
import retrofit2.Response as RetroResponse

class CharacterRemoteDataSource(retrofit: Retrofit) : DataSource<CharactersResponse> {
    private val api: CharacterService = retrofit.create(CharacterService::class.java)

    override suspend fun find(ids: List<Int>): CharactersResponse {
        fun find(response: RetroResponse<CharacterSchema>): CharactersResponse {
            if (!response.isSuccessful) throw Exception()
            return response.body()?.let { Response.of(listOf(it)) } ?: throw Exception()
        }

        fun find(response: RetroResponse<List<CharacterSchema>>): CharactersResponse {
            if (!response.isSuccessful) throw Exception()
            return response.body()?.let { Response.of(it) } ?: throw Exception()
        }

        return when (ids.size) {
            1 -> find(api.find(ids.first().toString()))
            else -> find(api.findMulti(ids.joinToString(",")))
        }
    }

    override suspend fun list(pageNumber: Int): CharactersResponse {
        return api.listPage(pageNumber).let { response ->
            if (!response.isSuccessful) throw Exception()
            response.body()?.results?.let { Response.of(it) } ?: throw Exception()
        }
    }

    override suspend fun search(map: Map<String, String>): CharactersResponse {
        return api.search(map).let { response ->
            if (!response.isSuccessful) throw Exception()
            response.body()?.results?.let { Response.of(it) } ?: throw Exception()
        }
    }
}