package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.CharacterRemoteDataSource
import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.models.contracts.CharacterContract
import academy.mukandrew.randmcatalog.models.entities.CharacterEntity
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.CharactersResponse
import academy.mukandrew.randmcatalog.utils.Response

class CharacterRepositoryImpl(
    private val remoteDataSource: CharacterRemoteDataSource
) : CharacterRepository() {
    override suspend fun getCharacters(ids: List<Int>): CharactersResponse {
        try {
            val response = remoteDataSource.find(ids)
            val list: List<CharacterContract> = response.data?.map {
                CharacterEntity(it.id)
            } ?: throw Exception()

            return Response.of(list)
        } catch (e: Exception) {
            return Response.of(e)
        }
    }

    override suspend fun listPageCharacters(pageNumber: Int): CharactersResponse {
        return Response.of(emptyList())
    }

    override suspend fun searchCharacter(searchModel: SearchInterface): CharactersResponse {
        return Response.of(emptyList())
    }
}