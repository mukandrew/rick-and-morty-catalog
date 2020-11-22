package academy.mukandrew.randmcatalog.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.SearchEpisodeUseCase
import academy.mukandrew.randmcatalog.utils.Response

class SearchEpisodeUseCaseImpl(
    private val repository: EpisodeRepository
) : SearchEpisodeUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): EpisodesResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchEpisodes(searchModel)
    }
}