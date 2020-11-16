package academy.mukandrew.randmcatalog.repositories

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse

abstract class EpisodeRepository {
    abstract suspend fun getEpisodes(ids: List<Int>): EpisodesResponse
    abstract suspend fun listPageEpisodes(pageNumber: Int): EpisodesResponse
    abstract suspend fun searchEpisodes(searchModel: SearchInterface): EpisodesResponse
}