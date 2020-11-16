package academy.mukandrew.randmcatalog.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.usecases.CharactersResponse

abstract class GetCharactersUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): CharactersResponse
}