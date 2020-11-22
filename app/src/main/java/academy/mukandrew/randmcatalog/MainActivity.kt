package academy.mukandrew.randmcatalog

import academy.mukandrew.randmcatalog.usecases.characters.abstracts.GetCharactersUseCase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject

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