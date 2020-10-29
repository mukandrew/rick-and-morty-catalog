package academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse

abstract class GetLocationsUseCase {
    abstract suspend operator fun invoke(ids: List<Int>): LocationsResponse
}