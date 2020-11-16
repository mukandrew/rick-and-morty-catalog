package academy.mukandrew.randmcatalog.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.usecases.EpisodesResponse

abstract class ListPageEpisodesUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): EpisodesResponse
}