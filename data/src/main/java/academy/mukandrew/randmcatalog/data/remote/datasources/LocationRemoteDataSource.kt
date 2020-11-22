package academy.mukandrew.randmcatalog.data.remote.datasources

import academy.mukandrew.randmcatalog.data.interfaces.DataSource
import academy.mukandrew.randmcatalog.data.remote.services.LocationService
import academy.mukandrew.randmcatalog.usecases.LocationsResponse
import academy.mukandrew.randmcatalog.utils.Response
import retrofit2.Retrofit

class LocationRemoteDataSource(retrofit: Retrofit) : DataSource<LocationsResponse> {
    private val api: LocationService = retrofit.create(LocationService::class.java)

    override suspend fun find(ids: List<Int>): LocationsResponse {
//        val response = api.find(id)
        return Response.of(emptyList())
    }

    override suspend fun list(pageNumber: Int): LocationsResponse {
        val response = api.listPage(pageNumber)
        return Response.of(emptyList())
    }

    override suspend fun search(map: Map<String, String>): LocationsResponse {
        val response = api.search(map)
        return Response.of(emptyList())
    }
}