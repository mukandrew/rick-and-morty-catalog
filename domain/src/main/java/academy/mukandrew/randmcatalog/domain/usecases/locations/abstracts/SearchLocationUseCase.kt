package academy.mukandrew.randmcatalog.domain.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.domain.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.LocationsResponse

abstract class SearchLocationUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): LocationsResponse
}