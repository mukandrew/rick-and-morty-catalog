package academy.mukandrew.randmcatalog.data.repositories

import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.repositories.LocationRepository
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse

class LocationRepositoryImpl : LocationRepository() {
    override suspend fun getLocations(ids: List<Int>): LocationsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun listPageLocations(numberPage: Int): LocationsResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchLocations(searchModel: SearchInterface): LocationsResponse {
        TODO("Not yet implemented")
    }
}