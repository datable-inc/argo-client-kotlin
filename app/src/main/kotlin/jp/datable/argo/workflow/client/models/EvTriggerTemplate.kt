package jp.datable.argo.workflow.client.models

data class EvTriggerTemplate(
    val argoWorkflow: EvArgoWorkflowTrigger? = null,
    val awsLambda: EvAWSLambdaTrigger? = null,
    val azureEventHubs: EvAzureEventHubsTrigger? = null,
    val conditions: String? = null,
    val conditionsReset: List<EvConditionsResetCriteria>? = null,
    val custom: EvCustomTrigger? = null,
    val http: EvHTTPTrigger? = null,
    val k8s: EvStandardK8STrigger? = null,
    val kafka: EvKafkaTrigger? = null,
    val log: EvLogTrigger? = null,
    val name: String? = null,
    val nats: EvNATSTrigger? = null,
    val openWhisk: EvOpenWhiskTrigger? = null,
    val pulsar: EvPulsarTrigger? = null,
    val slack: EvSlackTrigger? = null
)
