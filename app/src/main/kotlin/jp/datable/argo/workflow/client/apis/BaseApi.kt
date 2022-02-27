package jp.datable.argo.workflow.client.apis

import jp.datable.argo.workflow.client.https.HttpClient

open class BaseApi(protected val httpClient: HttpClient) {
    companion object {
        const val BASE_PATH = "api/v1/"
    }
}
