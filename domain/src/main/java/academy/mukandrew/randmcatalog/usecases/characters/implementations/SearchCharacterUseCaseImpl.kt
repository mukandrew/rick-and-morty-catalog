package academy.mukandrew.randmcatalog.usecases.characters.implementations

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.SearchCharacterUseCase
import academy.mukandrew.randmcatalog.utils.Response

class SearchCharacterUseCaseImpl(
    private val repository: CharacterRepository,
) : SearchCharacterUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): CharactersResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchCharacter(searchModel)
    }
}