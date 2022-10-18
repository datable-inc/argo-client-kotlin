package jp.datable.argo.workflow.client.models

data class WfData(val source: WfDataSource, val transformation: List<WfTransformationStep>)
