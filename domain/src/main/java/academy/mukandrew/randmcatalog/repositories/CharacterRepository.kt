package academy.mukandrew.randmcatalog.repositories

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.CharactersResponse

abstract class CharacterRepository {
    abstract suspend fun getCharacters(id: String): CharactersResponse
    abstract suspend fun listPageCharacters(pageNumber: Int): CharactersResponse
    abstract suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse
}