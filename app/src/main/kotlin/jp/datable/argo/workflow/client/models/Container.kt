package jp.datable.argo.workflow.client.models

data class Container(val image: String, val command: List<String>, val args: List<String>)
