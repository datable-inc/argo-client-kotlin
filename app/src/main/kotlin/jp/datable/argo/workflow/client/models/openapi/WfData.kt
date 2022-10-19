package jp.datable.argo.workflow.client.models.openapi

data class WfData(val source: WfDataSource, val transformation: List<WfTransformationStep>)
