package academy.mukandrew.randmcatalog.domain.usecases.locations.implementations

import academy.mukandrew.randmcatalog.domain.repositories.LocationRepository
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts.GetLocationsUseCase

class GetLocationsUseCaseImpl(
    private val repository: LocationRepository,
) : GetLocationsUseCase() {
    override suspend fun invoke(ids: List<Int>): LocationsResponse {
        return repository.getLocations(ids)
    }
}