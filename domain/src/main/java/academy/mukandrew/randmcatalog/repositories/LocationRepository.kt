package academy.mukandrew.randmcatalog.repositories

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.LocationsResponse

abstract class LocationRepository {
    abstract suspend fun getLocations(ids: List<Int>): LocationsResponse
    abstract suspend fun listPageLocations(numberPage: Int): LocationsResponse
    abstract suspend fun searchLocations(searchModel: SearchInterface): LocationsResponse
}