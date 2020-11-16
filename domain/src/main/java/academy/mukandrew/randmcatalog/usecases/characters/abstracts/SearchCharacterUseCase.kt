package academy.mukandrew.randmcatalog.usecases.characters.abstracts

import academy.mukandrew.randmcatalog.models.builders.search.SearchInterface
import academy.mukandrew.randmcatalog.usecases.CharactersResponse

abstract class SearchCharacterUseCase {
    abstract suspend operator fun invoke(searchModel: SearchInterface): CharactersResponse
}