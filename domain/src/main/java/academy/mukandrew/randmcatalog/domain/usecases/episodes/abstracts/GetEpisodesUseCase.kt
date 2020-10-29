package academy.mukandrew.randmcatalog.domain.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.EpisodesResponse

abstract class GetEpisodesUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): EpisodesResponse
}