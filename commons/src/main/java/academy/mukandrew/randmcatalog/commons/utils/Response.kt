package academy.mukandrew.randmcatalog.commons.utils

class Response<S : Any> private constructor(
    private val data: S? = null,
    private val error: Exception = Exception()
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
        if (data != null) onSuccess(data) else onError(error)
    }
}