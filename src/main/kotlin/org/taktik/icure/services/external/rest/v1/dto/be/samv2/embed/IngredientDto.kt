package org.taktik.icure.services.external.rest.v1.dto.be.samv2.embed

import java.io.Serializable

class IngredientDto(
        from: Long? = null,
        to: Long? = null,
        var rank: Int? = null,
        var type: IngredientTypeDto? = null,
        var knownEffect: Boolean? = null,
        var strengthDescription: String? = null,
        var strength:QuantityDto? = null,
        var additionalInformation:String ? = null,
        var substance: SubstanceDto? = null
) : DataPeriodDto(from, to), Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false

        other as IngredientDto

        if (rank != other.rank) return false
        if (type != other.type) return false
        if (knownEffect != other.knownEffect) return false
        if (strengthDescription != other.strengthDescription) return false
        if (strength != other.strength) return false
        if (additionalInformation != other.additionalInformation) return false
        if (substance != other.substance) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (rank ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (knownEffect?.hashCode() ?: 0)
        result = 31 * result + (strengthDescription?.hashCode() ?: 0)
        result = 31 * result + (strength?.hashCode() ?: 0)
        result = 31 * result + (additionalInformation?.hashCode() ?: 0)
        result = 31 * result + (substance?.hashCode() ?: 0)
        return result
    }
}
