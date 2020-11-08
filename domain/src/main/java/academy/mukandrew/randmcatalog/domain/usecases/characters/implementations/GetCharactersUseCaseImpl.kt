package academy.mukandrew.randmcatalog.domain.usecases.characters.implementations

import academy.mukandrew.randmcatalog.domain.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts.GetCharactersUseCase

class GetCharactersUseCaseImpl(
    private val repository: CharacterRepository,
) : GetCharactersUseCase() {
    override suspend fun invoke(ids: List<Int>): CharactersResponse {
        return repository.getCharacters(ids)
    }
}