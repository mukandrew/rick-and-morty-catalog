package academy.mukandrew.randmcatalog.domain.usecases.locations.implementations

import academy.mukandrew.randmcatalog.domain.repositories.LocationRepository
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts.ListPageLocationsUseCase

class ListPageLocationsUseCaseImpl(
    private val repository: LocationRepository,
) : ListPageLocationsUseCase() {
    override suspend fun invoke(pageNumber: Int): LocationsResponse {
        return repository.listPageLocations(pageNumber)
    }
}