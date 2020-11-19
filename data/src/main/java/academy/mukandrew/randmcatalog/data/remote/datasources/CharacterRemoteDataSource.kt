package academy.mukandrew.randmcatalog.data.remote.datasources

import academy.mukandrew.randmcatalog.data.interfaces.DataSource
import academy.mukandrew.randmcatalog.data.remote.services.CharacterService
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.utils.Response
import retrofit2.Retrofit

class CharacterRemoteDataSource(retrofit: Retrofit) : DataSource<CharactersResponse> {
    private val api: CharacterService = retrofit.create(CharacterService::class.java)

    override suspend fun find(id: String): CharactersResponse {
        val response = api.find(id)
        return Response.of(emptyList())
    }

    override suspend fun list(pageNumber: Int): CharactersResponse {
        val response = api.listPage(pageNumber)
        return Response.of(emptyList())
    }

    override suspend fun search(map: Map<String, String>): CharactersResponse {
        val response = api.search(map)
        return Response.of(emptyList())
    }
}
