package academy.mukandrew.randmcatalog.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.usecases.LocationsResponse

abstract class ListPageLocationsUseCase {
    abstract suspend operator fun invoke(pageNumber: Int): LocationsResponse
}