package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse

class EpisodeRepositoryImpl : EpisodeRepository() {
    override suspend fun getEpisodes(ids: List<Int>): EpisodesResponse {
        TODO("Not yet implemented")
    }

    override suspend fun listPageEpisodes(pageNumber: Int): EpisodesResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchEpisodes(searchModel: SearchInterface): EpisodesResponse {
        TODO("Not yet implemented")
    }
}