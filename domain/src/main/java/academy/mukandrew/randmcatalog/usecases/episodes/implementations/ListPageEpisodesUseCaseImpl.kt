package academy.mukandrew.randmcatalog.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.ListPageEpisodesUseCase

class ListPageEpisodesUseCaseImpl(
    private val repository: EpisodeRepository,
) : ListPageEpisodesUseCase() {
    override suspend fun invoke(pageNumber: Int): EpisodesResponse {
        return repository.listPageEpisodes(pageNumber)
    }
}