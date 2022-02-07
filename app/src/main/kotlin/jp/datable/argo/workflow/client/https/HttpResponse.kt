package jp.datable.argo.workflow.client.https

data class HttpResponse<T>(
    var statusCode: Int,
    var headers: Map<String, List<String>>,
    var data: T
)
