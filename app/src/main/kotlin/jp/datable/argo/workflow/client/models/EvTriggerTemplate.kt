package jp.datable.argo.workflow.client.models

data class EvTriggerTemplate(
    val argoWorkflow: EvArgoWorkflowTrigger?,
    val awsLambda: EvAWSLambdaTrigger?,
    val azureEventHubs: EvAzureEventHubsTrigger?,
    val conditions: String?,
    val conditionsReset: List<EvConditionsResetCriteria>?,
    val custom: EvCustomTrigger?,
    val http: EvHTTPTrigger?,
    val k8s: EvStandardK8STrigger?,
    val kafka: EvKafkaTrigger?,
    val log: EvLogTrigger?,
    val name: String?,
    val nats: EvNATSTrigger?,
    val openWhisk: EvOpenWhiskTrigger?,
    val pulsar: EvPulsarTrigger?,
    val slack: EvSlackTrigger?
)
