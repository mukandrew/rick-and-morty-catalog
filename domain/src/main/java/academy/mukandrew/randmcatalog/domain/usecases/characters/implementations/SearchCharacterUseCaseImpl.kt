package academy.mukandrew.randmcatalog.domain.usecases.characters.implementations

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts.SearchCharacterUseCase
import java.lang.Exception

class SearchCharacterUseCaseImpl(
    private val repository: CharacterRepository
) : SearchCharacterUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): CharactersResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchCharacter(searchModel)
    }
}