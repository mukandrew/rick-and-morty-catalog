package academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse

abstract class GetCharactersUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): CharactersResponse
}