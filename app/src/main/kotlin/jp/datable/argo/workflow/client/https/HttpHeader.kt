package jp.datable.argo.workflow.client.https

import okhttp3.Headers

data class HttpHeader(val value: Map<String, String>) {
    fun toOkHttpHeader(): Headers {
        return Headers.Builder()
            .also { value.entries.forEach { (key, value) -> it.add(key, value) } }
            .build()
    }
}
