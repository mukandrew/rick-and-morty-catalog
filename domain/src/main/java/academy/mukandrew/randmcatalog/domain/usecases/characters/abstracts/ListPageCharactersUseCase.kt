package academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse

abstract class ListPageCharactersUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): CharactersResponse
}