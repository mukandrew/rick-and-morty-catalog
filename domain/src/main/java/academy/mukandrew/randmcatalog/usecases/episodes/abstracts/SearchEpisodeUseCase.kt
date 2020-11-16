package academy.mukandrew.randmcatalog.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.EpisodesResponse

abstract class SearchEpisodeUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): EpisodesResponse
}