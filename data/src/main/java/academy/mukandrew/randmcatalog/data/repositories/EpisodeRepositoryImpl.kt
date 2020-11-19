package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.EpisodeRemoteDataSource
import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.utils.Response

class EpisodeRepositoryImpl(
    private val remoteDataSource: EpisodeRemoteDataSource
) : EpisodeRepository() {
    override suspend fun getEpisodes(id: String): EpisodesResponse {
        return Response.of(emptyList())
    }

    override suspend fun listPageEpisodes(pageNumber: Int): EpisodesResponse {
        return Response.of(emptyList())
    }

    override suspend fun searchEpisodes(searchModel: SearchInterface): EpisodesResponse {
        return Response.of(emptyList())
    }
}