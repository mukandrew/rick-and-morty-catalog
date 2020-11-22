package academy.mukandrew.randmcatalog.data.remote.responses

import kotlinx.android.parcel.Parcelize

@Parcelize
data class PageSchema<T : BaseSchema>(
    val info: InfoPageSchema,
    val results: List<T>
) : BaseSchema()