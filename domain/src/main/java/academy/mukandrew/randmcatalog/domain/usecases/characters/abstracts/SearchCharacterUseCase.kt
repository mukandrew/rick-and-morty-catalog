package academy.mukandrew.randmcatalog.domain.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.domain.models.search.SearchInterface
import academy.mukandrew.randmcatalog.domain.usecases.CharactersResponse

abstract class SearchCharacterUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): CharactersResponse
}