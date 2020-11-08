package academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.domain.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts.ListPageEpisodesUseCase

class ListPageEpisodesUseCaseImpl(
    private val repository: EpisodeRepository,
) : ListPageEpisodesUseCase() {
    override suspend fun invoke(pageNumber: Int): EpisodesResponse {
        return repository.listPageEpisodes(pageNumber)
    }
}