package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.CharacterRemoteDataSource
import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse

class CharacterRepositoryImpl(
    private val remote: CharacterRemoteDataSource
) : CharacterRepository() {
    override suspend fun getCharacters(ids: List<Int>): CharactersResponse {
        TODO("Not yet implemented")
    }

    override suspend fun listPageCharacters(pageNumber: Int): CharactersResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse {
        TODO("Not yet implemented")
    }
}