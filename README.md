<div align="center">
  <h1>argo-client-kotlin</h1>
</div>
<br/>

# Api List

Api | Method              | HTTP request                                          |
------------- |---------------------|-------------------------------------------------------|
WorkflowApi     | getWorkflow         | GET /api/v1/workflows/{namespace}/{name}              |
WorkflowApi     | getWorkflows        | GET /api/v1/workflows/{namespace}                     |
WorkflowApi     | createWorkflow      | POST /api/v1/workflows/{namespace}                    |
CronWorkflowApi | getCronWorkflow     | GET /api/v1/cron-workflows/{namespace}/{name}         |
CronWorkflowApi | getCronWorkflows    | GET /api/v1/cron-workflows/{namespace}                |
CronWorkflowApi | createCronWorkflow  | POST /api/v1/cron-workflows/{namespace}               |
CronWorkflowApi | suspendCronWorkflow | PUT /api/v1/cron-workflows/{namespace}/{name}/suspend |
CronWorkflowApi | resumeCronWorkflow  | PUT /api/v1/cron-workflows/{namespace}/{name}/resume  |
CronWorkflowApi | deleteCronWorkflow  | DELETE /api/v1/cron-workflows/{namespace}/{name}      |
EventSourceApi  | getEventSources     | GET /api/v1/event-sources/{namespace}/                |
EventSourceApi  | updateEventSource   | PUT /api/v1/event-sources/{namespace}/{name}          |
SensorApi       | createSensor        | POST /api/v1/sensors/{namespace}/{name}               |

# Example

```kotlin
import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import jp.datable.argo.workflow.client.apis.workflowApi.WorkflowApi
import jp.datable.argo.workflow.client.https.HttpClient
import jp.datable.argo.workflow.client.https.HttpHeader
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.Workflow

class Example {
  fun main(): HttpResponse<Workflow> {
    val httpClient = HttpClient.connect(
      "localhost:2746",
      HttpHeader(mapOf("Authorization" to "Bearer XXX"))
    )
    when (val result =
      WorkflowApi(httpClient).getWorkflow("namespace", "name")) {
      is Ok -> return result.value
      is Err -> throw result.error
    }
  }
}
```
