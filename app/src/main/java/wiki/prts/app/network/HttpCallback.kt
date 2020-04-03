package wiki.prts.app.network

interface HttpCallback {
    fun onFinish(responseData: String)
    fun onError(ex: Exception)
}