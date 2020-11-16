package academy.mukandrew.randmcatalog.usecases

import academy.mukandrew.randmcatalog.models.builders.search.SearchCharacter
import academy.mukandrew.randmcatalog.models.contracts.CharacterContract
import academy.mukandrew.randmcatalog.models.entities.CharacterEntity
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.GetCharactersUseCase
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.ListPageCharactersUseCase
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.SearchCharacterUseCase
import academy.mukandrew.randmcatalog.usecases.characters.implementations.GetCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.characters.implementations.ListPageCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.characters.implementations.SearchCharacterUseCaseImpl
import academy.mukandrew.randmcatalog.utils.Response
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.anyInt
import org.mockito.Mockito.anyList
import org.mockito.Mockito.mock
import org.mockito.Mockito.never
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class CharacterUseCaseTest {

    private lateinit var repository: CharacterRepository
    private lateinit var getCharacterUseCase: GetCharactersUseCase
    private lateinit var listCharacterUseCase: ListPageCharactersUseCase
    private lateinit var searchCharactersUseCase: SearchCharacterUseCase

    private val characterList = listOf<CharacterContract>(
        CharacterEntity(
            1,
            "Rick Sanchez",
        ),
        CharacterEntity(
            2,
            "Morty Smith"
        )
    )
    private val ids = listOf(1, 2)

    @Before
    fun setup() {
        repository = mock(CharacterRepository::class.java)
        getCharacterUseCase = GetCharactersUseCaseImpl(repository)
        listCharacterUseCase = ListPageCharactersUseCaseImpl(repository)
        searchCharactersUseCase = SearchCharacterUseCaseImpl(repository)
    }

    @Test
    fun `get character exception empty ids`() = runBlocking {
        val response = getCharacterUseCase(emptyList())
        verify(repository, never()).getCharacters(anyList())
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }

    @Test
    fun `get character success`() = runBlocking {
        `when`(repository.getCharacters(ids))
            .thenReturn(Response.of(characterList))

        val response = getCharacterUseCase(ids)

        verify(repository, times(1)).getCharacters(ids)
        assert(response.isSuccess)
        assert(response.data is List<CharacterContract>)
        assert(response.data?.equals(characterList) == true)
        assert(response.error == null)
    }

    @Test
    fun `get character exception`() = runBlocking {
        `when`(repository.getCharacters(ids))
            .thenReturn(Response.of(Exception()))
        val response = getCharacterUseCase(ids)
        verify(repository, times(1)).getCharacters(ids)
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }

    @Test
    fun `list page character page zero exception`() = runBlocking {
        val pageNumber = 0
        val response = listCharacterUseCase(pageNumber)
        verify(repository, never()).listPageCharacters(anyInt())
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }

    @Test
    fun `list page character success`() = runBlocking {
        val pageNumber = 1
        `when`(repository.listPageCharacters(pageNumber)).thenReturn(Response.of(characterList))
        val response = listCharacterUseCase(pageNumber)
        verify(repository, times(pageNumber)).listPageCharacters(pageNumber)
        assert(response.isSuccess)
        assert(response.data is List<CharacterContract>)
        assert(response.data?.equals(characterList) == true)
        assert(response.error == null)
    }

    @Test
    fun `list page character exception`() = runBlocking {
        val pageNumber = 1
        `when`(repository.listPageCharacters(pageNumber)).thenReturn(Response.of(Exception()))
        val response = listCharacterUseCase(pageNumber)
        verify(repository, times(1)).listPageCharacters(pageNumber)
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }

    @Test
    fun `search character invalid params`() = runBlocking {
        val searchModel = SearchCharacter.Builder().build()
        val response = searchCharactersUseCase(searchModel)
        verify(repository, never()).searchCharacter(searchModel)
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }

    @Test
    fun `search character success`() = runBlocking {
        val searchModel = SearchCharacter
            .Builder()
            .name(characterList.first().name ?: String())
            .build()
        `when`(repository.searchCharacter(searchModel)).thenReturn(Response.of(characterList))
        val response = searchCharactersUseCase(searchModel)
        verify(repository, times(1)).searchCharacter(searchModel)
        assert(response.isSuccess)
        assert(response.data is List<CharacterContract>)
        assert(response.data?.equals(characterList) == true)
        assert(response.error == null)
    }

    @Test
    fun `search character error`() = runBlocking {
        val searchModel = SearchCharacter
            .Builder()
            .name(characterList.first().name ?: String())
            .build()
        `when`(repository.searchCharacter(searchModel)).thenReturn(Response.of(Exception()))
        val response = searchCharactersUseCase(searchModel)
        verify(repository, times(1)).searchCharacter(searchModel)
        assert(response.isSuccess.not())
        assert(response.data == null)
        assert(response.error is Exception)
    }
}