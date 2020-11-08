package academy.mukandrew.randmcatalog.domain.repositories

import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse

abstract class CharacterRepository {
    abstract suspend fun getCharacters(ids: List<Int>): CharactersResponse
    abstract suspend fun listPageCharacters(pageNumber: Int): CharactersResponse
    abstract suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse
}