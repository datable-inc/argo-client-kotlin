package jp.datable.argo.workflow.client.https

data class HttpException(
    var code: Int,
    var responseHeader: Map<String, List<String>>,
    var responseBody: String
) : Exception()
