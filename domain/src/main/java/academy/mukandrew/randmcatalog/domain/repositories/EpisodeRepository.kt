package academy.mukandrew.randmcatalog.domain.repositories

import academy.mukandrew.randmcatalog.domain.models.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse

abstract class EpisodeRepository {
    abstract suspend fun getEpisodes(ids: List<Int>): EpisodesResponse
    abstract suspend fun listPageEpisodes(pageNumber: Int): EpisodesResponse
    abstract suspend fun searchEpisodes(searchModel: SearchInterface): EpisodesResponse
}