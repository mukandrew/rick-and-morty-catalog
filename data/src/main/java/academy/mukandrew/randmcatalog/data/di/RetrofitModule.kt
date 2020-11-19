package academy.mukandrew.randmcatalog.data.di

import academy.mukandrew.randmcatalog.data.remote.config.RetrofitConfig
import org.koin.dsl.module

class RetrofitModule {
    val value = module {
        factory { RetrofitConfig().invoke() }
    }
}