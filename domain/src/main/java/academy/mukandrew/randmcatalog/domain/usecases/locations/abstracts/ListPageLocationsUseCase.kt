package academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse

abstract class ListPageLocationsUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): LocationsResponse
}