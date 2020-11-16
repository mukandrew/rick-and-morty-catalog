package academy.mukandrew.randmcatalog.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.GetEpisodesUseCase

class GetEpisodesUseCaseImpl(
    private val repository: EpisodeRepository,
) : GetEpisodesUseCase() {
    override suspend fun invoke(ids: List<Int>): EpisodesResponse {
        return repository.getEpisodes(ids)
    }
}