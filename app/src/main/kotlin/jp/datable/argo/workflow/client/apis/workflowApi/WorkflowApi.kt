package jp.datable.argo.workflow.client.apis.workflowApi

import com.github.michaelbull.result.Result
import com.github.michaelbull.result.andThen
import jp.datable.argo.workflow.client.apis.BaseApi
import jp.datable.argo.workflow.client.https.HttpResponse
import jp.datable.argo.workflow.client.https.QueryParams
import jp.datable.argo.workflow.client.models.CreateWorkflowRequest
import jp.datable.argo.workflow.client.models.Workflow
import jp.datable.argo.workflow.client.models.Workflows
import jp.datable.argo.workflow.client.https.HttpClient
import okhttp3.Call
import org.springframework.http.HttpMethod

class WorkflowApi(
    httpClient: HttpClient
) : BaseApi(httpClient) {
    companion object {
        private const val WORKFLOWS_PATH = "workflows"
    }

    /**
     * GET /api/v1/workflows/{namespace}/{name}
     */
    fun getWorkflow(namespace: String, name: String): Result<HttpResponse<Workflow>, Exception> {
        return getWorkflowWithHttpInfo(namespace, name)
    }

    private fun getWorkflowCall(namespace: String, name: String): Result<Call, Exception> {
        val path = buildWorkflowPath(namespace, name)
        return httpClient.buildCall(path, HttpMethod.GET, null, null)
    }

    private fun getWorkflowWithHttpInfo(
        namespace: String,
        name: String
    ): Result<HttpResponse<Workflow>, Exception> {
        return getWorkflowCall(namespace, name).andThen {
            httpClient.execute(it, Workflow::class.java)
        }
    }

    /**
     * GET /api/v1/workflows/{namespace}
     */
    fun getWorkflows(namespace: String, queryParams: QueryParams?): Result<HttpResponse<Workflows>, Exception> {
        return getWorkflowsWithHttpInfo(namespace, queryParams)
    }

    private fun getWorkflowsCall(namespace: String, queryParams: QueryParams?): Result<Call, Exception> {
        val path = buildWorkflowsPath(namespace)
        return httpClient.buildCall(path, HttpMethod.GET, queryParams, null)
    }

    private fun getWorkflowsWithHttpInfo(
        namespace: String,
        queryParams: QueryParams?
    ): Result<HttpResponse<Workflows>, Exception> {
        return getWorkflowsCall(namespace, queryParams).andThen {
            httpClient.execute(it, Workflows::class.java)
        }
    }

    /**
     * POST /api/v1/workflows/{namespace}
     */
    fun createWorkflow(
        namespace: String,
        body: CreateWorkflowRequest
    ): Result<HttpResponse<Workflow>, Exception> {
        return createWorkflowWithHttpInfo(namespace, body)
    }

    private fun createWorkflowCall(namespace: String, body: CreateWorkflowRequest): Result<Call, Exception> {
        val path = buildWorkflowsPath(namespace)
        return httpClient.buildCall(path, HttpMethod.POST, null, body)
    }

    private fun createWorkflowWithHttpInfo(
        namespace: String,
        body: CreateWorkflowRequest
    ): Result<HttpResponse<Workflow>, Exception> {
        return createWorkflowCall(namespace, body).andThen {
            httpClient.execute(it, Workflow::class.java)
        }
    }

    private fun buildWorkflowsPath(namespace: String): String {
        return StringBuilder().also {
            it.append(BASE_PATH)
            it.append(WORKFLOWS_PATH)
            it.append("/")
            it.append(namespace)
        }.toString()
    }

    private fun buildWorkflowPath(namespace: String, name: String): String {
        return StringBuilder().also {
            it.append(BASE_PATH)
            it.append(WORKFLOWS_PATH)
            it.append("/")
            it.append(namespace)
            it.append("/")
            it.append(name)
        }.toString()
    }
}
