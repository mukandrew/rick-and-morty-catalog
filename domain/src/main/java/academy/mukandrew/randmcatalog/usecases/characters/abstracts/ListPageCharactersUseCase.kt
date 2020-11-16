package academy.mukandrew.randmcatalog.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.usecases.CharactersResponse

abstract class ListPageCharactersUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): CharactersResponse
}