package academy.mukandrew.randmcatalog.usecases.episodes.abstracts

import academy.mukandrew.randmcatalog.usecases.EpisodesResponse

abstract class GetEpisodesUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): EpisodesResponse
}