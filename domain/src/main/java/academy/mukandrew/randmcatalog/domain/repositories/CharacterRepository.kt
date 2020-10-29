package academy.mukandrew.randmcatalog.domain.repositories

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.Character
import academy.mukandrew.randmcatalog.domain.models.search.SearchInterface

abstract class CharacterRepository {
    abstract suspend fun getCharacters(ids: List<Int>): Response<List<Character>>
    abstract suspend fun listPageCharacters(pageNumber: Int): Response<List<Character>>
    abstract suspend fun searchCharacter(searchModel: SearchInterface): Response<List<Character>>
}