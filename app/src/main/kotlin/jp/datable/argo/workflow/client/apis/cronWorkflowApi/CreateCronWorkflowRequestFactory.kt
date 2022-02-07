package jp.datable.argo.workflow.client.apis.cronWorkflowApi

import jp.datable.argo.workflow.client.models.Container
import jp.datable.argo.workflow.client.models.CreateCronWorkflowRequest
import jp.datable.argo.workflow.client.models.CronWorkflow
import jp.datable.argo.workflow.client.models.CronWorkflowSpec
import jp.datable.argo.workflow.client.models.CronWorkflowStatus
import jp.datable.argo.workflow.client.models.ObjectMeta
import jp.datable.argo.workflow.client.models.Template
import jp.datable.argo.workflow.client.models.WorkflowSpec

class CreateCronWorkflowRequestFactory() {
    data class MetadataRequest(
        val name: String,
        val generateName: String,
        val namespace: String,
        val labels: Map<String, String>,
    )

    data class SpecRequest(
        val entrypoint: String,
        val templateRequest: TemplateRequest
    ) {
        data class TemplateRequest(
            val name: String,
            val containerRequest: ContainerRequest
        ) {
            data class ContainerRequest(
                val image: String,
                val command: List<String>,
                val args: List<String>
            )
        }
    }

    companion object {
        fun create(
            metadataRequest: MetadataRequest,
            specRequest: SpecRequest,
        ): CreateCronWorkflowRequest {
            return CreateCronWorkflowRequest(
                CronWorkflow(
                    apiVersion = null,
                    kind = null,
                    metadata = ObjectMeta(
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
                    spec = CronWorkflowSpec(
                        schedule = "* * * * *",
                        workflowSpec = WorkflowSpec(
                            entrypoint = specRequest.entrypoint,
                            templates = listOf(
                                Template(
                                    name = specRequest.templateRequest.name,
                                    container = Container(
                                        image = specRequest.templateRequest.containerRequest.image,
                                        command = specRequest.templateRequest.containerRequest.command,
                                        args = specRequest.templateRequest.containerRequest.args
                                    )
                                )
                            )
                        )
                    ),
                    status = CronWorkflowStatus(
                        lastScheduleTime = null
                    )
                )
            )
        }
    }
}
