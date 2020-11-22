package academy.mukandrew.randmcatalog.utils

class Response<S : Any> private constructor(
    val data: S? = null,
    val error: Exception? = null
) {
    companion object {
        fun <T : Any> of(value: T): Response<T> {
            return Response(value)
        }

        fun <T : Any> of(value: Exception): Response<T> {
            return Response(error = value)
        }
    }

    val isSuccess: Boolean = data != null

    fun on(onSuccess: (data: S) -> Unit, onError: (error: Exception) -> Unit) {
        if (data != null) onSuccess(data) else onError(error ?: Exception())
    }
}