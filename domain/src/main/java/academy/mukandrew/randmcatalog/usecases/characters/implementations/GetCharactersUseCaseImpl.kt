package academy.mukandrew.randmcatalog.usecases.characters.implementations

import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.GetCharactersUseCase
import academy.mukandrew.randmcatalog.utils.Response

class GetCharactersUseCaseImpl(
    private val repository: CharacterRepository
) : GetCharactersUseCase() {
    override suspend fun invoke(ids: List<Int>): CharactersResponse {
        if (ids.isEmpty()) return Response.of(Exception())

        return repository.getCharacters(ids)
    }
}