package academy.mukandrew.randmcatalog.usecases.locations.abstracts

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.LocationsResponse

abstract class SearchLocationUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): LocationsResponse
}