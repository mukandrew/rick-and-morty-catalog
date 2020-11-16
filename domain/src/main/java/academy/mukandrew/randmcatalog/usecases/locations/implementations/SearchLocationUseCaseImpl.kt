package academy.mukandrew.randmcatalog.usecases.locations.implementations

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.repositories.LocationRepository
import academy.mukandrew.randmcatalog.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.usecases.locations.abstracts.SearchLocationUseCase
import academy.mukandrew.randmcatalog.utils.Response

class SearchLocationUseCaseImpl(
    private val repository: LocationRepository,
) : SearchLocationUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): LocationsResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchLocations(searchModel)
    }
}