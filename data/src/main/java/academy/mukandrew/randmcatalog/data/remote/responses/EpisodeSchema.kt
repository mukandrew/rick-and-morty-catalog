package academy.mukandrew.randmcatalog.data.remote.responses

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class EpisodeSchema(
    val id: Int,
    val name: String? = null,
    @SerializedName("air_date")
    val airDate: String? = null,
    val episode: String? = null,
    val characters: List<String>? = null
) : BaseSchema()