package academy.mukandrew.randmcatalog.usecases.locations.implementations

import academy.mukandrew.randmcatalog.repositories.LocationRepository
import academy.mukandrew.randmcatalog.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.usecases.locations.abstracts.ListPageLocationsUseCase

class ListPageLocationsUseCaseImpl(
    private val repository: LocationRepository
) : ListPageLocationsUseCase() {
    override suspend fun invoke(pageNumber: Int): LocationsResponse {
        return repository.listPageLocations(pageNumber)
    }
}