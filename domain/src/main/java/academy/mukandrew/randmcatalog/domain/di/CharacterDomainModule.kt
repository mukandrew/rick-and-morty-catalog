package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.GetCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.ListPageCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.SearchCharacterUseCaseImpl
import org.koin.dsl.module

class CharacterDomainModule {
    operator fun invoke() = module {
        factory { GetCharactersUseCaseImpl(get()) }
        factory { ListPageCharactersUseCaseImpl(get()) }
        factory { SearchCharacterUseCaseImpl(get()) }
    }
}