package academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.domain.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts.GetEpisodesUseCase

class GetEpisodesUseCaseImpl(
    private val repository: EpisodeRepository,
) : GetEpisodesUseCase() {
    override suspend fun invoke(ids: List<Int>): EpisodesResponse {
        return repository.getEpisodes(ids)
    }
}