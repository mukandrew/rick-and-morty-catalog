package academy.mukandrew.randmcatalog.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.usecases.LocationsResponse

abstract class GetLocationsUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): LocationsResponse
}