package academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.repositories.EpisodeRepository
import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse
import academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts.SearchEpisodeUseCase
import java.lang.Exception

class SearchEpisodeUseCaseImpl(
    private val repository: EpisodeRepository,
) : SearchEpisodeUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): EpisodesResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchEpisodes(searchModel)
    }
}