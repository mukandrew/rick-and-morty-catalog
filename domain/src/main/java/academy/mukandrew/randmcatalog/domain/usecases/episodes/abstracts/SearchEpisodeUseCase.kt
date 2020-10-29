package academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.domain.models.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse

abstract class SearchEpisodeUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): EpisodesResponse
}