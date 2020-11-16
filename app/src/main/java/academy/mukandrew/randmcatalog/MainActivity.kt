package academy.mukandrew.randmcatalog

import academy.mukandrew.randmcatalog.usecases.characters.abstracts.GetCharactersUseCase
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.SearchCharacterUseCase
import academy.mukandrew.randmcatalog.usecases.characters.implementations.GetCharactersUseCaseImpl
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    private val useCase: GetCharactersUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        useCase
    }
}