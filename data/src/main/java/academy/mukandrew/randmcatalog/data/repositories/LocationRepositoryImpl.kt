package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.data.remote.datasources.LocationRemoteDataSource
import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.LocationRepository
import academy.mukandrew.randmcatalog.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.utils.Response

class LocationRepositoryImpl(
    private val remoteDataSource: LocationRemoteDataSource
) : LocationRepository() {
    override suspend fun getLocations(id: String): LocationsResponse {
        return Response.of(emptyList())
    }

    override suspend fun listPageLocations(numberPage: Int): LocationsResponse {
        return Response.of(emptyList())
    }

    override suspend fun searchLocations(searchModel: SearchInterface): LocationsResponse {
        return Response.of(emptyList())
    }
}