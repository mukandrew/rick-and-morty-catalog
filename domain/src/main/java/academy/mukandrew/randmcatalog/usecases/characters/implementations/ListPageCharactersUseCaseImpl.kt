package academy.mukandrew.randmcatalog.usecases.characters.implementations

import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.ListPageCharactersUseCase
import academy.mukandrew.randmcatalog.utils.Response

class ListPageCharactersUseCaseImpl(
    private val repository: CharacterRepository,
) : ListPageCharactersUseCase() {
    companion object {
        private const val MIN_PAGE_NUMBER = 1
    }

    override suspend fun invoke(pageNumber: Int): CharactersResponse {
        if (pageNumber < MIN_PAGE_NUMBER) return Response.of(Exception())
        return repository.listPageCharacters(pageNumber)
    }
}