package academy.mukandrew.randmcatalog.usecases.locations.implementations

import academy.mukandrew.randmcatalog.repositories.LocationRepository
import academy.mukandrew.randmcatalog.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.usecases.locations.abstracts.GetLocationsUseCase

class GetLocationsUseCaseImpl(
    private val repository: LocationRepository
) : GetLocationsUseCase() {
    override suspend fun invoke(ids: List<Int>): LocationsResponse {
        return repository.getLocations("")
    }
}