package academy.mukandrew.randmcatalog.domain.usecases.characters.implementations

import academy.mukandrew.randmcatalog.domain.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts.ListPageCharactersUseCase

class ListPageCharactersUseCaseImpl(
    private val repository: CharacterRepository
) : ListPageCharactersUseCase() {
    override suspend fun invoke(pageNumber: Int): CharactersResponse {
        return repository.listPageCharacters(pageNumber)
    }
}