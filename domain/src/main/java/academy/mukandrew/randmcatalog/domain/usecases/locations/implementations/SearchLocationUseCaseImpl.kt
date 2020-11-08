package academy.mukandrew.randmcatalog.domain.usecases.locations.implementations

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.repositories.LocationRepository
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts.SearchLocationUseCase

class SearchLocationUseCaseImpl(
    private val repository: LocationRepository,
) : SearchLocationUseCase() {
    override suspend fun invoke(searchModel: SearchInterface): LocationsResponse {
        if (!searchModel.hasValidField()) return Response.of(Exception())
        return repository.searchLocations(searchModel)
    }
}