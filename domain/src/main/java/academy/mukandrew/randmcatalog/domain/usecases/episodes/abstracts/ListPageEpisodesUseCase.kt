package academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse

abstract class ListPageEpisodesUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): EpisodesResponse
}