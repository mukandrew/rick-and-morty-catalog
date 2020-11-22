package academy.mukandrew.randmcatalog.data.remote.responses

import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationSchema(
    val id: Int,
    val name: String? = null,
    val type: String? = null,
    val dimension: String? = null,
    val residents: List<String>? = null
) : BaseSchema()