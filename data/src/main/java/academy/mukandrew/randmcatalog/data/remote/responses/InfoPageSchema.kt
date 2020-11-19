package academy.mukandrew.randmcatalog.data.remote.responses

import kotlinx.android.parcel.Parcelize

@Parcelize
data class InfoPageSchema(
    val code: Int,
    val pages: Int,
    val next: String? = null,
    val prev: String? = null
) : BaseSchema()