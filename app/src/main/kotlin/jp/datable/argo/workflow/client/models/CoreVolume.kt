package jp.datable.argo.workflow.client.models

data class CoreVolume(
    val name: String,
    val awsElasticBlockStore: CoreAWSElasticBlockStoreVolumeSource? = null,
    val azureDisk: CoreAzureDiskVolumeSource? = null,
    val azureFile: CoreAzureFileVolumeSource? = null,
    val cephfs: CoreCephFSVolumeSource? = null,
    val cinder: CoreCinderVolumeSource? = null,
    val configMap: CoreConfigMapVolumeSource? = null,
    val csi: CoreCSIVolumeSource? = null,
    val downwardAPI: CoreDownwardAPIVolumeSource? = null,
    val emptyDir: CoreEmptyDirVolumeSource? = null,
    val ephemeral: CoreEphemeralVolumeSource? = null,
    val fc: CoreFCVolumeSource? = null,
    val flexVolume: CoreFlexVolumeSource? = null,
    val flocker: CoreFlockerVolumeSource? = null,
    val gcePersistentDisk: CoreGCEPersistentDiskVolumeSource? = null,
    val gitRepo: CoreGitRepoVolumeSource? = null,
    val glusterfs: CoreGlusterfsVolumeSource? = null,
    val hostPath: CoreHostPathVolumeSource? = null,
    val iscsi: CoreISCSIVolumeSource? = null,
    val nfs: CoreNFSVolumeSource? = null,
    val persistentVolumeClaim: CorePersistentVolumeClaimVolumeSource? = null,
    val photonPersistentDisk: CorePhotonPersistentDiskVolumeSource? = null,
    val portworxVolume: CorePortworxVolumeSource? = null,
    val projected: CoreProjectedVolumeSource? = null,
    val quobyte: CoreQuobyteVolumeSource? = null,
    val rbd: CoreRBDVolumeSource? = null,
    val scaleIO: CoreScaleIOVolumeSource? = null,
    val secret: CoreSecretVolumeSource? = null,
    val storageos: CoreStorageOSVolumeSource? = null,
    val vsphereVolume: CoreVsphereVirtualDiskVolumeSource? = null
)
