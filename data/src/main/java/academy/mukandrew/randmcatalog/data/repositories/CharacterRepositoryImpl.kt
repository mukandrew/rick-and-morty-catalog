package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.CharacterRemoteDataSource
import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.utils.Response

class CharacterRepositoryImpl(
) : CharacterRepository() {
    override suspend fun getCharacters(ids: List<Int>): CharactersResponse {
        return Response.Companion.of(emptyList())
    }

    override suspend fun listPageCharacters(pageNumber: Int): CharactersResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse {
        TODO("Not yet implemented")
    }
}