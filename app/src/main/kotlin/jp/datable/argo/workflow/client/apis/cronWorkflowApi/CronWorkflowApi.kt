package jp.datable.argo.workflow.client.apis.cronWorkflowApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.models.CreateCronWorkflowRequest
import jp.datable.argo.workflow.client.models.CronWorkflow
import jp.datable.argo.workflow.client.models.CronWorkflows
import jp.datable.argo.workflow.client.https.HttpClient
import okhttp3.Call
import org.springframework.http.HttpMethod

class CronWorkflowApi(
    httpClient: HttpClient
) : BaseApi(httpClient) {
    companion object {
        private const val CRON_WORKFLOWS_PATH = "cron-workflows"
    }

    /**
     * GET /api/v1/cron-workflows/{namespace}/{name}
     */
    fun getCronWorkflow(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return getCronWorkflowWithHttpInfo(namespace, name)
    }

    private fun getCronWorkflowCall(namespace: String, name: String): Result<Call, Exception> {
        val path = buildCronWorkflowPath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getCronWorkflowWithHttpInfo(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return getCronWorkflowCall(namespace, name).andThen {
            httpClient.execute(it, CronWorkflow::class.java)
        }
    }

    /**
     * GET /api/v1/cron-workflows/{namespace}
     */
    fun getCronWorkflows(
        namespace: String
    ): Result<HttpResponse<CronWorkflows>, Exception> {
        return getCronWorkflowsWithHttpInfo(namespace)
    }

    private fun getCronWorkflowsCall(namespace: String): Result<Call, Exception> {
        val path = buildCronWorkflowsPath(namespace)
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getCronWorkflowsWithHttpInfo(
        namespace: String
    ): Result<HttpResponse<CronWorkflows>, Exception> {
        return getCronWorkflowsCall(namespace).andThen {
            httpClient.execute(it, CronWorkflows::class.java)
        }
    }

    /**
     * POST /api/v1/cron-workflows/{namespace}
     */
    fun createCronWorkflow(
        namespace: String,
        body: CreateCronWorkflowRequest
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return createCronWorkflowWithHttpInfo(namespace, body)
    }

    private fun createCronWorkflowCall(namespace: String, body: CreateCronWorkflowRequest): Result<Call, Exception> {
        val path = buildCronWorkflowsPath(namespace)
        return httpClient.buildCall(path, HttpMethod.POST, null, body)
    }

    private fun createCronWorkflowWithHttpInfo(
        namespace: String,
        body: CreateCronWorkflowRequest
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return createCronWorkflowCall(namespace, body).andThen {
            httpClient.execute(it, CronWorkflow::class.java)
        }
    }

    /**
     * PUT /api/v1/cron-workflows/{namespace}/{name}/suspend
     */
    fun suspendCronWorkflow(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return suspendCronWorkflowWithHttpInfo(namespace, name)
    }

    private fun suspendCronWorkflowCall(namespace: String, name: String): Result<Call, Exception> {
        val path = buildSuspendCronWorkflowPath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.PUT, null, null)
    }

    private fun suspendCronWorkflowWithHttpInfo(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return suspendCronWorkflowCall(namespace, name).andThen {
            httpClient.execute(it, CronWorkflow::class.java)
        }
    }

    /**
     * PUT /api/v1/cron-workflows/{namespace}/{name}/resume
     */
    fun resumeCronWorkflow(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return resumeCronWorkflowWithHttpInfo(namespace, name)
    }

    private fun resumeCronWorkflowCall(namespace: String, name: String): Result<Call, Exception> {
        val path = buildResumeCronWorkflowPath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.PUT, null, null)
    }

    private fun resumeCronWorkflowWithHttpInfo(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return resumeCronWorkflowCall(namespace, name).andThen {
            httpClient.execute(it, CronWorkflow::class.java)
        }
    }

    /**
     * DELETE /api/v1/cron-workflows/{namespace}/{name}
     */
    fun deleteCronWorkflow(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return deleteCronWorkflowWithHttpInfo(namespace, name)
    }

    private fun deleteCronWorkflowCall(namespace: String, name: String): Result<Call, Exception> {
        val path = buildCronWorkflowPath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.DELETE, null, null)
    }

    private fun deleteCronWorkflowWithHttpInfo(
        namespace: String,
        name: String
    ): Result<HttpResponse<CronWorkflow>, Exception> {
        return deleteCronWorkflowCall(namespace, name).andThen {
            httpClient.execute(it, CronWorkflow::class.java)
        }
    }

    private fun buildCronWorkflowsPath(namespace: String): String {
        return StringBuilder().also {
            it.append(BASE_PATH)
            it.append(CRON_WORKFLOWS_PATH)
            it.append("/")
            it.append(namespace)
        }.toString()
    }

    private fun buildCronWorkflowPath(namespace: String, name: String): String {
        return StringBuilder().also {
            it.append(BASE_PATH)
            it.append(CRON_WORKFLOWS_PATH)
            it.append("/")
            it.append(namespace)
            it.append("/")
            it.append(name)
        }.toString()
    }

    private fun buildSuspendCronWorkflowPath(namespace: String, name: String): String {
        return buildCronWorkflowPath(namespace, name) + "/suspend"
    }

    private fun buildResumeCronWorkflowPath(namespace: String, name: String): String {
        return buildCronWorkflowPath(namespace, name) + "/resume"
    }
}
