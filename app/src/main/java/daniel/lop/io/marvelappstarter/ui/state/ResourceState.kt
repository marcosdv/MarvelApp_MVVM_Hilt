package daniel.lop.io.marvelappstarter.ui.state

sealed class ResourceState<T>(
    var data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T): ResourceState<T>(data)
    class Error<T>(menssage: String, data: T? = null): ResourceState<T>(data, menssage)
    class Loading<T>: ResourceState<T>()
    class Empty<T>: ResourceState<T>()
}