package academy.mukandrew.randmcatalog.data.remote.datasources

import academy.mukandrew.randmcatalog.data.interfaces.DataSource
import academy.mukandrew.randmcatalog.data.remote.services.EpisodeService
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.utils.Response
import retrofit2.Retrofit

class EpisodeRemoteDataSource(retrofit: Retrofit) : DataSource<EpisodesResponse> {
    private val api: EpisodeService = retrofit.create(EpisodeService::class.java)

    override suspend fun find(id: String): EpisodesResponse {
        val response = api.find(id)
        return Response.of(emptyList())
    }

    override suspend fun list(pageNumber: Int): EpisodesResponse {
        val response = api.listPage(pageNumber)
        return Response.of(emptyList())
    }

    override suspend fun search(map: Map<String, String>): EpisodesResponse {
        val response = api.search(map)
        return Response.of(emptyList())
    }
}