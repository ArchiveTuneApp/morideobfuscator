/*
 * ArchiveTune (2026)
 * © Rukamori — github.com/rukamori
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.morideobfuscator

import kotlinx.serialization.Serializable

@Serializable
internal data class TransformPlan(
    val playerId: String,
    val playerUrl: String,
    val sourceSha256: String,
    val signatureTimestamp: Int?,
    val signatureProgram: String?,
    val signatureFunction: String?,
    val nProgram: String?,
    val nFunction: String?,
    val createdAtMillis: Long,
)

@Serializable
internal data class CachedTransformArtifact(
    val plan: TransformPlan,
    val playerJavaScript: String,
)
