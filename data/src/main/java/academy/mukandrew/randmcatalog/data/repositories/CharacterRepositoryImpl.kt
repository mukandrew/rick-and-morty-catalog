package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.CharacterRemoteDataSource
import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.utils.Response

class CharacterRepositoryImpl(
    private val remoteDataSource: CharacterRemoteDataSource
) : CharacterRepository() {
    override suspend fun getCharacters(id: String): CharactersResponse {
        return Response.of(emptyList())
    }

    override suspend fun listPageCharacters(pageNumber: Int): CharactersResponse {
        return Response.of(emptyList())
    }

    override suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse {
        return Response.of(emptyList())
    }
}