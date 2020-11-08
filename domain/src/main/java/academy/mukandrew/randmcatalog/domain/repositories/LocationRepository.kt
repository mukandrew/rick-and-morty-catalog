package academy.mukandrew.randmcatalog.domain.repositories

import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse

abstract class LocationRepository {
    abstract suspend fun getLocations(ids: List<Int>): LocationsResponse
    abstract suspend fun listPageLocations(numberPage: Int): LocationsResponse
    abstract suspend fun searchLocations(searchModel: SearchInterface): LocationsResponse
}