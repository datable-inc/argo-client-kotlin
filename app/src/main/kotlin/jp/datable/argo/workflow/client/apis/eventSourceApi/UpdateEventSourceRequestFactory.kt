package jp.datable.argo.workflow.client.apis.eventSourceApi

import jp.datable.argo.workflow.client.models.AuthSecret
import jp.datable.argo.workflow.client.models.EventSource
import jp.datable.argo.workflow.client.models.EventSourceSpec
import jp.datable.argo.workflow.client.models.ObjectMeta
import jp.datable.argo.workflow.client.models.SecretKeySelector
import jp.datable.argo.workflow.client.models.UpdateEventSourceRequest
import jp.datable.argo.workflow.client.models.Webhook

class UpdateEventSourceRequestFactory {
    data class MetadataRequest(
        val name: String,
        val generateName: String,
        val namespace: String,
        val labels: Map<String, String>,
    )

    data class SpecRequest(val webhook: WebhookRequest) {
        data class WebhookRequest(val endpoint: String)
    }

    companion object {
        fun create(
            metadataRequest: MetadataRequest,
            specRequest: SpecRequest
        ): UpdateEventSourceRequest {
            return UpdateEventSourceRequest(
                EventSource(
                    metadata =
                    ObjectMeta(
                        name = metadataRequest.name,
                        generateName = metadataRequest.generateName,
                        namespace = metadataRequest.namespace,
                        labels = metadataRequest.labels,
                        uid = null,
                        resourceVersion = null,
                        generation = null,
                        creationTimestamp = null,
                        annotations = null
                    ),
                    spec =
                    EventSourceSpec(
                        webhook =
                        Webhook(
                            authSecret = AuthSecret(key = "", name = "", optional = false),
                            endpoint = specRequest.webhook.endpoint,
                            metadata = null,
                            method = "",
                            port = "",
                            serverCertSecret =
                            SecretKeySelector(key = "", name = "", optional = false),
                            serverKeySecret =
                            SecretKeySelector(key = "", name = "", optional = false),
                            url = ""
                        )
                    )
                )
            )
        }
    }
}
